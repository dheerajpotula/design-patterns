package com.potulad.learning.designpatterns.state;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

/**
 * Class representing a gumball machine. Users of this class can perform all functions that are defined in the
 * {@link StateTransition} class. Depending on the currentState, the behavior of the gumball machine changes.
 */
@Getter
public class GumballMachine extends StateTransition {

    @NonNull
    private final NoQuarter noQuarter;

    @NonNull
    private final HasQuarter hasQuarter;

    @NonNull
    private final OutOfGumballs outOfGumballs;

    @NonNull
    private final GumballSold gumballSold;

    @Setter
    private StateTransition currentState;

    @Setter
    private int currentNumberOfGumballs;

    public GumballMachine(int startingNumberOfGumballs) {
        noQuarter = new NoQuarter(this);
        hasQuarter = new HasQuarter(this);
        outOfGumballs = new OutOfGumballs(this);
        gumballSold = new GumballSold(this);

        currentNumberOfGumballs = startingNumberOfGumballs;

        if(currentNumberOfGumballs > 0) {
            currentState = noQuarter;
        } else {
            currentState = outOfGumballs;
        }
    }

    @Override
    public void insertQuarter() {
        currentState.insertQuarter();
    }

    @Override
    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    @Override
    public void turnCrank() {
        currentState.turnCrank();
    }

    @Override
    public void dispenseGumball() {
        currentState.dispenseGumball();
    }

    @Override
    public void refillGumballs(int noOfGumballsToRefill) {
        currentState.refillGumballs(noOfGumballsToRefill);
    }
}
