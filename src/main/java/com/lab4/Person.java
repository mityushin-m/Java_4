package com.lab4;

public class Person {
    private String id;
    private String name;
    private String gender;
    private String birthDate;
    private String division;
    private String salary;

    public Person(String id, String name, String gender, String birthDate, 
                  String division, String salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.division = division;
        this.salary = salary;
    }
    
    public String getId() { return id; }
    public String getName() { return name; }
    public String getGender() { return gender; }
    public String getBirthDate() { return birthDate; }
    public String getDivision() { return division; }
    public String getSalary() { return salary; }
    
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setGender(String gender) { this.gender = gender; }
    public void setBirthDate(String birthDate) { this.birthDate = birthDate; }
    public void setDivision(String division) { this.division = division; }
    public void setSalary(String salary) { this.salary = salary; }
    
    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", division='" + division + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}