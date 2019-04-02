package com.potulad.learning.designpatterns.state;

import lombok.AllArgsConstructor;
import lombok.NonNull;

/**
 * State for when a quarter has been accepted and a gumball is sold. Decreases the inventory count of the gumball
 * machine by 1.
 */
@AllArgsConstructor
public class GumballSold extends StateTransition {

    @NonNull
    private final GumballMachine gumballMachine;

    @Override
    public void dispenseGumball() {
        System.out.println("1 Gumball dispensed!");
        gumballMachine.setCurrentNumberOfGumballs(gumballMachine.getCurrentNumberOfGumballs() - 1);

        if(gumballMachine.getCurrentNumberOfGumballs() == 0) {
            System.out.println("No more gumballs in the machine!");
            gumballMachine.setCurrentState(gumballMachine.getOutOfGumballs());
        } else {
            System.out.println("Gumballs remaining in the machine : " + gumballMachine.getCurrentNumberOfGumballs());
            gumballMachine.setCurrentState(gumballMachine.getNoQuarter());
        }
    }
}
