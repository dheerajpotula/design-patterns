import com.potulad.learning.designpatterns.state.GumballMachine;
import lombok.NonNull;

public class StatePatternTest {
    public static void main(String args[]) {
        final GumballMachine gumballMachine = new GumballMachine(3);

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();

        insertQuarterTurnCrankAndDispenseGumball(gumballMachine);
        insertQuarterTurnCrankAndDispenseGumball(gumballMachine);
        insertQuarterTurnCrankAndDispenseGumball(gumballMachine);

        gumballMachine.refillGumballs(2);
        insertQuarterTurnCrankAndDispenseGumball(gumballMachine);
        insertQuarterTurnCrankAndDispenseGumball(gumballMachine);

        invalidTurnCrank(gumballMachine);
        invalidDispenseGumball(gumballMachine);
        invalidInsertQuarter(gumballMachine);

        gumballMachine.refillGumballs(10);
        invalidRefill(gumballMachine, 1);
    }

    private static void insertQuarterTurnCrankAndDispenseGumball(@NonNull GumballMachine gumballMachine) {
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispenseGumball();
    }

    private static void invalidInsertQuarter(@NonNull GumballMachine gumballMachine) {
        try {
            gumballMachine.insertQuarter();
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
    }

    private static void invalidTurnCrank(@NonNull GumballMachine gumballMachine) {
        try {
            gumballMachine.turnCrank();
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
    }

    private static void invalidDispenseGumball(@NonNull GumballMachine gumballMachine) {
        try {
            gumballMachine.dispenseGumball();
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
    }

    private static void invalidRefill(@NonNull GumballMachine gumballMachine, int numberOfGumballsToRefill) {
        try {
            gumballMachine.refillGumballs(numberOfGumballsToRefill);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
    }
}
