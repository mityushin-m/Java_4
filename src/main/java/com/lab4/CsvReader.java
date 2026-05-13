package com.lab4;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class CsvReader {
    
    public static void readAndPrint(String csvFilePath, char separator) {
        InputStream in = CsvReader.class.getClassLoader().getResourceAsStream(csvFilePath);
        
        if (in == null) {
            System.out.println("Файл не найден: " + csvFilePath);
            return;
        }
        
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(in, StandardCharsets.UTF_8))) {
            
            String line;
            int lineNum = 0;
            
            while ((line = reader.readLine()) != null) {
                lineNum++;
                System.out.print("Строка " + lineNum + ": ");
                
                String[] columns = line.split(String.valueOf(separator));
                for (String col : columns) {
                    System.out.print(col + " | ");
                }
                System.out.println();
            }
            System.out.println("Всего строк: " + lineNum);
            
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}