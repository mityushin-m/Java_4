package com.lab4;

/**
 * Класс, представляющий человека из CSV-файла.
 * Содержит информацию о человеке и ссылку на его подразделение.
 * 
 * @author Митюшин Максим
 */
public class Person {
	/** Уникальный идентификатор человека из CSV */
    private String id;
    /** Имя человека */
    private String name;
    /** Пол (Male/Female) */
    private String gender;
    /** Дата рождения в формате DD.MM.YYYY */
    private String birthDate;
    /** Подразделение, в котором работает человек */
    private Division division;
    /** Зарплата */
    private String salary;

    /**
     * Конструктор человека.
     * 
     * @param id идентификатор из CSV
     * @param name имя
     * @param gender пол
     * @param birthDate дата рождения
     * @param division подразделение (объект Division)
     * @param salary зарплата
     */
    public Person(String id, String name, String gender, String birthDate, 
                  Division division, String salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.division = division;
        this.salary = salary;
    }
    
    /**
     * Возвращает ID человека.
     * 
     * @return идентификатор
     */
    public String getId() { return id; }
    /**
     * Возвращает имя человека.
     * 
     * @return имя
     */
    public String getName() { return name; }
    /**
     * Возвращает пол человека.
     * 
     * @return "Male" или "Female"
     */
    public String getGender() { return gender; }
    /**
     * Возвращает дату рождения.
     * 
     * @return дата в формате DD.MM.YYYY
     */
    public String getBirthDate() { return birthDate; }
    /**
     * Возвращает подразделение человека.
     * 
     * @return объект Division
     */
    public Division getDivision() { return division; }
    /**
     * Возвращает зарплату.
     * 
     * @return зарплата
     */
    public String getSalary() { return salary; }
    
    /**
     * Устанавливает ID человека.
     * 
     * @param id новый идентификатор
     */
    public void setId(String id) { this.id = id; }
    /**
     * Устанавливает имя человека.
     * 
     * @param name новое имя
     */
    public void setName(String name) { this.name = name; }
    /**
     * Устанавливает пол человека.
     * 
     * @param gender пол ("Male" или "Female")
     */
    public void setGender(String gender) { this.gender = gender; }
    /**
     * Устанавливает дату рождения.
     * 
     * @param birthDate дата в формате DD.MM.YYYY
     */
    public void setBirthDate(String birthDate) { this.birthDate = birthDate; }
    /**
     * Устанавливает подразделение человека.
     * 
     * @param division объект Division
     */
    public void setDivision(Division division) { this.division = division; }
    /**
     * Устанавливает зарплату.
     * 
     * @param salary зарплата
     */
    public void setSalary(String salary) { this.salary = salary; }
    
    /**
     * Возвращает строковое представление человека.
     * 
     * @return строка со всеми полями
     */
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