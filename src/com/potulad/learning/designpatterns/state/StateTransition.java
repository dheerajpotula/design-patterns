package com.potulad.learning.designpatterns.state;

/**
 * Abstract class for all states that defines all the possible actions that can be performed on the Gumball Machine
 * as a whole. Also see {@link GumballMachine}
 *
 * All operations in this abstract class throw IllegalArgumentExceptions when called. If a specific operation makes
 * sense for a sub-class of this class, it can override the function to something more meaningful.
 */
public abstract class StateTransition {

    public void insertQuarter() {
        throw new IllegalArgumentException("Operation not supported!");
    }

    public void ejectQuarter() {
        throw new IllegalArgumentException("Operation not supported!");
    }

    public void turnCrank() {
        throw new IllegalArgumentException("Operation not supported!");
    }

    public void dispenseGumball() {
        throw new IllegalArgumentException("Operation not supported!");
    }

    public void refillGumballs(int noOfGumballsToRefill) {

    }
}
