package com.lab4;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    
    public static List<Person> readPersons(String csvFilePath, char separator) {
    	List<Person> persons = new ArrayList<>();
        InputStream in = CsvReader.class.getClassLoader().getResourceAsStream(csvFilePath);
        
        if (in == null) {
            System.out.println("Файл не найден: " + csvFilePath);
            return persons;
        }
        
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
                if (columns.length >= 6) {
                    Person person = new Person(
                        columns[0].trim(),  // id
                        columns[1].trim(),  // name
                        columns[2].trim(),  // gender
                        columns[3].trim(),  // birthDate
                        columns[4].trim(),  // division
                        columns[5].trim()   // salary
                    );
                    persons.add(person);}
                else {
                    System.out.println("Пропущена строка " + lineNum + 
                                     ": недостаточно колонок (" + columns.length + ")");
                }
            }
            System.out.println("Всего считано строк: " + persons.size());
            
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        return persons;
    }
    
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