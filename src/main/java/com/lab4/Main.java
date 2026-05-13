package com.lab4;

import java.util.List;

/**
 * Главный класс программы.
 * Запускает чтение CSV-файла и вывод списка людей.
 * 
 * @author Митюшин Максим
 */
public class Main {
	/**
     * Точка входа в программу.
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
	    List<Person> persons = CsvReader.readPersons("foreign_names.csv", ';');
	    System.out.println("Первые 50 записей:");
	    CsvReader.printPersons(persons, 50);
	}
}
