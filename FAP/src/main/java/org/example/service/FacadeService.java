// FacadeService.java
package org.example.service;

public class FacadeService {
    private CourseService courseService;
    private TeacherService teacherService;

    public FacadeService() {
        courseService = CourseService.getInstance();
        teacherService = TeacherService.getInstance();
    }

    public void operationDeleteTeacher(int teacherId) {
        courseService.deleteByTeacherID(teacherId);
        teacherService.delete(teacherId);
    }

    // Thêm phương thức để đăng ký sinh viên vào khóa học thông qua facade
    public void enrollStudentsToCourse(int courseId, int teacherId, int newStudentCount) {
        // Trước hết, kiểm tra xem giáo viên có tồn tại không
        if (teacherService.findById(teacherId) != null) {
            // Nếu tồn tại, gọi phương thức của CourseService để đăng ký sinh viên và cập nhật thông tin khóa học
            courseService.enrollStudents(courseId, newStudentCount);
            courseService.updateCourseInfo(courseId, newStudentCount);
        } else {
            System.out.println("Teacher not found!");
        }
    }
}
