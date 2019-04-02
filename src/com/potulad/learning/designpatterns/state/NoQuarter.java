package com.potulad.learning.designpatterns.state;

import lombok.AllArgsConstructor;
import lombok.NonNull;

/**
 * State for when the gumball machine has no quarter inserted yet but there are gumballs to dispense.
 */
@AllArgsConstructor
public class NoQuarter extends StateTransition {

    @NonNull
    private final GumballMachine gumballMachine;

    @Override
    public void insertQuarter() {
        System.out.println("Inserted a quarter!");
        gumballMachine.setCurrentState(gumballMachine.getHasQuarter());
    }
}
