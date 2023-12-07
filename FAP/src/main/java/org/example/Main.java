package org.example;

import org.example.entity.Course;
import org.example.entity.Student;
import org.example.entity.Teacher;
import org.example.interfaces.NotifyInterface;
import org.example.interfaces.UpdateInfoRequest;
import org.example.service.AccountFactory;
import org.example.service.AdminService;
import org.example.service.CourseService;
import org.example.service.FacadeService;
import org.example.service.TeacherService;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "Dinh Van Dong");
        Teacher teacher2 = new Teacher(2, "Ngo Thi Mai Loan");
        TeacherService.getInstance().insert(teacher);
        TeacherService.getInstance().insert(teacher2);
        CourseService courseService = CourseService.getInstance();
        Course course = new Course(1, "CS101", "CS", "Introduction to Computer Science", new Date(), new Date(), teacher, new ArrayList<>());
        Course course2 = new Course(2, "CS102", "CS", "SDLC", new Date(), new Date(), teacher2, new ArrayList<>());
        courseService.insert(course);
        courseService.insert(course2);
        System.out.println("Course: " + course.getName() + ", Teacher: " + course.getTeacher().getName());
        System.out.println("Course2: " + course2.getName() + ", Teacher: " + course2.getTeacher().getName());
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "An"));
        studentList.add(new Student(2, "Binh"));
        studentList.add(new Student(3, "Nam"));
        courseService.enrollStudents(course.getId(), studentList);

        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.toString());
        }
        UpdateInfoRequest updateInfoRequest = new AdminService(TeacherService.getInstance());
        updateInfoRequest.updateInfoTeacher(teacher);
        NotifyInterface notifyStudent = AccountFactory.createNotification("Student");
        notifyStudent.notification();
        NotifyInterface notifyTeacher = AccountFactory.createNotification("Teacher");
        notifyTeacher.notification();
        NotifyInterface notifyParent = AccountFactory.createNotification("Parent");
        notifyParent.notification();
        FacadeService facadeService = new FacadeService();
        facadeService.operationDeleteTeacher(1);
    }
}
