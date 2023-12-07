// AdminService.java
package org.example.service;

import org.example.entity.Teacher;
import org.example.interfaces.UpdateInfoRequest;

public class AdminService implements UpdateInfoRequest {
    public TeacherService teacherService;

    public AdminService(TeacherService teacherService){
        this.teacherService = teacherService;
    }

    @Override
    public void updateInfoTeacher(Teacher teacher) {
        teacherService.update(teacher);
    }
}
