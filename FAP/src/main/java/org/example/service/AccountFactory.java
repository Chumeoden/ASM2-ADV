// AccountFactory.java
package org.example.service;

import org.example.entity.Parent;
import org.example.entity.Student;
import org.example.entity.Teacher;
import org.example.interfaces.NotifyInterface;

public class AccountFactory {
    public static NotifyInterface createNotification(String type) {
        if (type.equals("Student")) {
            return new StudentNotification();
        } else if (type.equals("Teacher")) {
            return new TeacherNotification();
        } else if (type.equals("Parent")) {
            return new ParentNotification();
        }
        throw new IllegalArgumentException("Invalid product type.");
    }
}
