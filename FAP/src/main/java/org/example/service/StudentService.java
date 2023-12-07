// StudentService.java
package org.example.service;

import org.example.entity.Student;
import org.example.interfaces.StudentInterface;
import java.util.List;
public class StudentService implements StudentInterface {
    // Singleton - Design Pattern
    public static StudentService instance = null;

    public static synchronized StudentService getInstance() {
        if (instance == null) {
            instance = new StudentService();
        }
        return instance;
    }
    @Override
    public Student insert(Student student) {
        return null;
    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(int id) {
        return null;
    }
}
