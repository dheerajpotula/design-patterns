package com.potulad.learning.designpatterns.mvc;

import lombok.NonNull;

/**
 * A simple class that shows the student's name and roll number.
 */
public class StudentView {
    public void displayStudentInformation(@NonNull Student student) {
        System.out.println("Student Info");
        System.out.println("Name : " + student.getName());
        System.out.println("Roll Number : " + student.getRollNumber());
    }
}
