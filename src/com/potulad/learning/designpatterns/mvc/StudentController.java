package com.potulad.learning.designpatterns.mvc;

import lombok.AllArgsConstructor;
import lombok.NonNull;

/**
 * A student controller that interacts with the {@link Student} and the {@link StudentView}
 */
@AllArgsConstructor
public class StudentController {

    /**
     * The student model.
     */
    @NonNull
    private Student model;

    /**
     * The student view.
     */
    @NonNull
    private StudentView view;

    public void setStudentName(@NonNull String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentRollNumber(long rollNumber) {
        model.setRollNumber(rollNumber);
    }

    public long getStudentRollNumber() {
        return model.getRollNumber();
    }

    public void display() {
        view.displayStudentInformation(model);
    }
}
