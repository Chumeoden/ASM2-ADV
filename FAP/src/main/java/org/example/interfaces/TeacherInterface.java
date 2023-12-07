// TeacherInterface.java
package org.example.interfaces;

import org.example.entity.Teacher;

import java.util.List;

public interface TeacherInterface {
    Teacher insert(Teacher teacher);
    Teacher update(Teacher teacher);
    boolean delete(int id);
    List<Teacher> findAll();
    Teacher findById(int id);
}
