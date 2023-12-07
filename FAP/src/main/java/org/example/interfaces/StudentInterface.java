// StudentInterface.java
package org.example.interfaces;

import org.example.entity.Student;

import java.util.List;

public interface StudentInterface {
    Student insert(Student student);
    Student update(Student student);
    boolean delete(int id);
    List<Student> findAll();
    Student findById(int id);
}
