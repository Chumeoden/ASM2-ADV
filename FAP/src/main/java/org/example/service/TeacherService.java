// TeacherService.java
package org.example.service;

import org.example.entity.Teacher;
import org.example.interfaces.TeacherInterface;

import java.util.List;

public class TeacherService implements TeacherInterface {
    // Singleton - Design Pattern
    public static TeacherService instance = null;
    public static synchronized TeacherService getInstance() {
        if (instance == null) {
            instance = new TeacherService();
        }
        return instance;
    }
    @Override
    public Teacher insert(Teacher teacher) {
        System.out.println("Insert teacher " + teacher.getName());
        return null;
    }
    @Override
    public Teacher update(Teacher teacher) {
        System.out.println("Update teacher");
        return null;
    }
    @Override
    public boolean delete(int id) {
        System.out.println("Delete teacher with id " + id);
        return false;
    }
    @Override
    public List<Teacher> findAll() {
        System.out.println("Find all teachers");
        return null;
    }
    @Override
    public Teacher findById(int id) {
        System.out.println("Find teacher by id " + id);
        return null;
    }
}
