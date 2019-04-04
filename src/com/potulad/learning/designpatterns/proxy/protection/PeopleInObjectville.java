package com.potulad.learning.designpatterns.proxy.protection;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Enum for all the registered users in matchmaking app.
 */
@AllArgsConstructor
public enum PeopleInObjectville {
    JOE("joe", "M"),
    BRIAN("brian", "M"),
    KATE("kate", "F");

    @Getter
    private final String name;

    @Getter
    private final String gender;
}
