package com.lab4;

public class Person {
    private String id;
    private String name;
    private String gender;
    private String birthDate;
    private Division division;
    private String salary;

    public Person(String id, String name, String gender, String birthDate, 
                  Division division, String salary) {
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
    public Division getDivision() { return division; }
    public String getSalary() { return salary; }
    
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setGender(String gender) { this.gender = gender; }
    public void setBirthDate(String birthDate) { this.birthDate = birthDate; }
    public void setDivision(Division division) { this.division = division; }
    public void setSalary(String salary) { this.salary = salary; }
    
    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", divisionName='" + division.getName() + '\'' +
                ", divisionId='" + division.getId() + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}