package com.potulad.learning.designpatterns.proxy.protection;

import lombok.NonNull;

/**
 * Interface to define the activities that you can do on a Person's profile assuming you have the right permissions.
 */
public interface PersonBean {

    /**
     * Gets the name of the person
     */
    @NonNull
    String getName();

    /**
     * Sets the name of the person
     */
    void setName(String name);

    /**
     * Get the gender of the person
     */
    @NonNull
    String getGender();

    /**
     * Set the gender of the person
     */
    void setGender(String gender);

    /**
     * Get the average Hot or Not Rating. Score ranges from 1 to 10. The higher the better.
     */
    double getHotOrNotRating();

    /**
     * Set the Hot or Not Rating according to your opinion. Score ranges from 1 to 10. The higher the better.
     */
    void setHotOrNotRating(double hotOrNotRating);
}
