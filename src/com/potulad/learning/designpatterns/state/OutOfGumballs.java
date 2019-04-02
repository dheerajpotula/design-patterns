package com.potulad.learning.designpatterns.state;

import lombok.AllArgsConstructor;
import lombok.NonNull;

/**
 * State for when the Gumball machine is now out of gumballs.
 */
@AllArgsConstructor
public class OutOfGumballs extends StateTransition {

    @NonNull
    private final GumballMachine gumballMachine;

    @Override
    public void refillGumballs(int noOfGumballsToRefill) {
        if(noOfGumballsToRefill > 0) {
            System.out.println("Refilled Gumball machine with " + noOfGumballsToRefill + " Gumballs!");
            gumballMachine.setCurrentNumberOfGumballs(noOfGumballsToRefill);
            gumballMachine.setCurrentState(gumballMachine.getNoQuarter());
        } else {
            throw new IllegalArgumentException("Invalid number of gumballs to refill!");
        }
    }
}
