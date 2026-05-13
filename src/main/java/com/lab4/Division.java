package com.lab4;

public class Division {
    private static int nextId = 1;
    
    private int id;
    private String name;
    
    public Division(String name) {
        this.id = nextId++;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Division{id=" + id + ", name='" + name + "'}";
    }
}