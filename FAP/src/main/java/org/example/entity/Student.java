// Student.java
package org.example.entity;

public class Student {
    private int id;
    private String name;

    public Student() {
        // Constructor mặc định
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Thêm getter và setter cho các thuộc tính

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
