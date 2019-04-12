package com.potulad.learning.designpatterns.mvc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

/**
 * A Student class that acts as a model.
 */
@Getter
@Setter
@AllArgsConstructor
public class Student {

    /**
     * Name of the student.
     */
    @NonNull
    private String name;

    /**
     * Roll number of the student.
     */
    private long rollNumber;

    /**
     * Sets the name of the student. Valid names contain one or more characters and shouldn't be null.
     * @throws IllegalArgumentException if the given name is not a valid name
     */
    public void setName(@NonNull String name) {
        isValidName(name);
        this.name = name;
    }

    private void isValidName(@NonNull String name) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Invalid name!");
        }
    }}
