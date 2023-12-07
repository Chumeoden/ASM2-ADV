// Teacher.java
package org.example.entity;

public class Teacher {
    private int id;
    private String name;

    public Teacher() {
        // Constructor mặc định
    }

    public Teacher(int id, String name) {
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
