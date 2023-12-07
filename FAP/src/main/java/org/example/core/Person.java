// Person.java
package org.example.core;

public class Person implements Cloneable {
    private int id;
    private String name;

    public Person() {
        // Constructor mặc định
    }

    public Person(int id, String name) {
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

    // Phương thức clone
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
