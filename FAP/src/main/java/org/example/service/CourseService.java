// CourseService.java
package org.example.service;

import org.example.entity.Course;
import org.example.entity.Student;
import org.example.interfaces.CourseInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class CourseService extends Observable implements CourseInterface {
    private List<Course> courses;
    private static CourseService instance;

    private CourseService() {
        this.courses = new ArrayList<>();
    }

    public static synchronized CourseService getInstance() {
        if (instance == null) {
            instance = new CourseService();
        }
        return instance;
    }

    @Override
    public void insert(Course course) {
        courses.add(course);
    }

    @Override
    public Course update(Course course) {
        // Implement logic để cập nhật khóa học
        // Chú ý: Trong ứng dụng thực tế, bạn cần cập nhật thông tin của khóa học
        // chứ không phải thêm lại nó vào danh sách
        return course;
    }

    @Override
    public boolean delete(int id) {
        // Implement logic để xóa khóa học
        // Chú ý: Trong ứng dụng thực tế, cần thực hiện việc xóa một khóa học từ danh sách
        // Dựa vào ID hoặc một thuộc tính khác là duy nhất
        Course course = findById(id);
        if (course != null) {
            courses.remove(course);
            return true;
        }
        return false;
    }

    @Override
    public void deleteByTeacherID(int id) {
        // Implement logic để xóa khóa học theo ID giáo viên
        // Chú ý: Trong ứng dụng thực tế, cần thực hiện việc xóa các khóa học liên quan đến một giáo viên
        List<Course> coursesToDelete = new ArrayList<>();
        for (Course course : courses) {
            if (course.getTeacher() != null && course.getTeacher().getId() == id) {
                coursesToDelete.add(course);
            }
        }
        courses.removeAll(coursesToDelete);
    }

    @Override
    public List<Course> findAll() {
        return courses;
    }

    @Override
    public Course findById(int id) {
        for (Course course : courses) {
            if (course.getId() == id) {
                return course;
            }
        }
        return null;
    }

    @Override
    public List<Course> findByName(String name) {
        List<Course> result = new ArrayList<>();
        for (Course course : courses) {
            if (course.getName().equals(name)) {
                result.add(course);
            }
        }
        return result;
    }

    // Thêm phương thức để đăng ký sinh viên vào khóa học
    public void enrollStudents(int courseId, List<Student> students) {  // Sửa ở đây
        Course course = findById(courseId);
        if (course != null) {
            course.getStudentList().addAll(students);
        }
    }

    // Thêm phương thức để cập nhật thông tin khóa học
    public void updateCourseInfo(int courseId, int newStudentCount) {
        Course course = findById(courseId);
        if (course != null) {
            // Cập nhật thông tin khóa học, ví dụ: số lượng sinh viên đăng ký
            course.setStudentCount(newStudentCount);
            // Gọi phương thức thông báo cho những đối tượng quan sát (Observer)
            setChanged();
            notifyObservers(course);
        }
    }

    public void enrollStudents(int courseId, int newStudentCount) {
    }
}
