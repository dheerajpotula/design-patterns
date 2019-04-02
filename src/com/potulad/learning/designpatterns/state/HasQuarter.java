package com.potulad.learning.designpatterns.state;

import lombok.AllArgsConstructor;
import lombok.NonNull;

/**
 * State for when a quarter has been inserted into the gumball machine.
 */
@AllArgsConstructor
public class HasQuarter extends StateTransition {

    @NonNull
    private final GumballMachine gumballMachine;

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter has been ejected!");
        gumballMachine.setCurrentState(gumballMachine.getNoQuarter());
    }

    @Override
    public void turnCrank() {
        System.out.println("The crank has been turned. Dispensing gumballs!");
        gumballMachine.setCurrentState(gumballMachine.getGumballSold());
    }
}
