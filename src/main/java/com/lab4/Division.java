package com.lab4;

/**
 * Класс, представляющий подразделение.
 * ID генерируется автоматически при создании объекта.
 * 
 * @author Митюшин Максим
 */
public class Division {
	/** Счётчик для генерации уникальных ID подразделений */
    private static int nextId = 1;
    
    /** Уникальный идентификатор подразделения */
    private int id;
    /** Название подразделения */
    private String name;
    
    /**
     * Конструктор подразделения.
     * ID присваивается автоматически (1, 2, 3...).
     * 
     * @param name название подразделения
     */
    public Division(String name) {
        this.id = nextId++;
        this.name = name;
    }
    
    /**
     * Возвращает ID подразделения.
     * 
     * @return уникальный идентификатор
     */
    public int getId() {
        return id;
    }
    
    /**
     * Возвращает название подразделения.
     * 
     * @return название подразделения
     */
    public String getName() {
        return name;
    }
    
    /**
     * Устанавливает название подразделения.
     * 
     * @param name новое название
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Возвращает строковое представление подразделения.
     * 
     * @return строка вида "Division{id=1, name='I'}"
     */
    @Override
    public String toString() {
        return "Division{id=" + id + ", name='" + name + "'}";
    }
}