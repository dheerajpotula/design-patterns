package com.potulad.learning.designpatterns.proxy.protection;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Class for an actual person with feelings and all.
 */
@EqualsAndHashCode
public class ActualPerson implements PersonBean {

    private int numberOfReviews = 0;

    public ActualPerson(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String gender;

    @Getter
    private double hotOrNotRating;

    @Override
    public void setHotOrNotRating(double hotOrNotRating) {
        final double totalRating = this.hotOrNotRating * numberOfReviews;
        numberOfReviews = numberOfReviews + 1;
        this.hotOrNotRating = (totalRating + hotOrNotRating) / numberOfReviews;
    }
}
