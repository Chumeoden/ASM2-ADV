// CourseInterface.java
package org.example.interfaces;

import org.example.entity.Course;

import java.util.List;

public interface CourseInterface {
    void insert(Course course);
    Course update(Course course);
    boolean delete(int id);
    void deleteByTeacherID(int id);
    List<Course> findAll();
    Course findById(int id);
    List<Course> findByName(String name);
}
