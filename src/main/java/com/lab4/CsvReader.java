package com.lab4;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс для чтения CSV-файла и создания объектов Person.
 * 
 * @author Митюшин Максим
 */
public class CsvReader {
    
	/**
     * Читает CSV-файл и возвращает список людей.
     * Автоматически создаёт объекты Division для уникальных названий подразделений.
     * ID подразделений присваиваются по порядку: первому уникальному встреченному - 1, второму - 2 и т.д.
     * 
     * @param csvFilePath путь к файлу
     * @param separator разделитель колонок
     * @return список объектов Person
     */
    public static List<Person> readPersons(String csvFilePath, char separator) {
    	List<Person> persons = new ArrayList<>();
    	List<Division> divisions = new ArrayList<>();
        InputStream in = CsvReader.class.getClassLoader().getResourceAsStream(csvFilePath);
        
        if (in == null) {
            System.out.println("Файл не найден: " + csvFilePath);
            return persons;
        }
        
        // Читаем файл построчно
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(in, StandardCharsets.UTF_8))) {
            
            String line;
            int lineNum = 0;
            
            while ((line = reader.readLine()) != null) {
                lineNum++;
                
             // Пропускаем заголовок (первую строку)
                if (lineNum == 1) {
                    continue;
                }
                
                String[] columns = line.split(String.valueOf(separator));
                
             // Проверяем, что в строке достаточно колонок
                if (columns.length >= 6) {
                	String divisionName = columns[4].trim();
                    
                    Division division = findDivision(divisions, divisionName);
                    
                 // Если не нашли, создаём новое
                    if (division == null) {
                        division = new Division(divisionName);
                        divisions.add(division);
                    }
                	
                    Person person = new Person(
                        columns[0].trim(),  // id
                        columns[1].trim(),  // name
                        columns[2].trim(),  // gender
                        columns[3].trim(),  // birthDate
                        division,  // division
                        columns[5].trim()   // salary
                    );
                    persons.add(person);
                }
                else {
                    System.out.println("Пропущена строка " + lineNum + 
                                     ": недостаточно колонок (" + columns.length + ")");
                }
            }
            System.out.println("Всего считано строк: " + persons.size());
            System.out.println("Уникальных подразделений: " + divisions.size());
            
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        return persons;
    }
    
    /**
     * Ищет подразделение по названию в списке.
     * 
     * @param divisions список подразделений
     * @param name название для поиска
     * @return найденное подразделение или null, если не найдено
     */
    private static Division findDivision(List<Division> divisions, String name) {
        for (Division d : divisions) {
            if (d.getName().equals(name)) {
                return d;
            }
        }
        return null;
    }
    
    /**
     * Выводит указанное количество записей из списка в консоль.
     * 
     * @param persons список людей
     * @param limit максимальное количество выводимых записей
     */
    public static void printPersons(List<Person> persons, int limit) {
        int count = 0;
        for (Person p : persons) {
            System.out.println(p);
            count++;
            if (count >= limit) break;
        }
        System.out.println("Показано " + count + " из " + persons.size() + " записей");
    }
}