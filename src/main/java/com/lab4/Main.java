package com.lab4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
	    List<Person> persons = CsvReader.readPersons("foreign_names.csv", ';');
	    System.out.println("Первые 50 записей:");
	    CsvReader.printPersons(persons, 50);
	}
}
