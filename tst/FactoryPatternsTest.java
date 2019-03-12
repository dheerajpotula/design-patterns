import com.potulad.learning.designpatterns.factory.factorymethod.BranchLocation;
import com.potulad.learning.designpatterns.factory.factorymethod.PizzaStore;
import com.potulad.learning.designpatterns.factory.pizza.Pizza;
import com.potulad.learning.designpatterns.factory.pizza.PizzaType;
import com.potulad.learning.designpatterns.util.SpringContext;

/**
 * Test both Factory Patterns - Factory Method and Abstract Factory
 */
public class FactoryPatternsTest {

    public static void main(String args[]) {
        orderAPizza(PizzaType.CHEESE, BranchLocation.NY);
        orderAPizza(PizzaType.CHICKEN, BranchLocation.NY);
        orderAPizza(PizzaType.PEPPERONI, BranchLocation.NY);
        orderAPizza(PizzaType.PINEAPPLE, BranchLocation.NY);

        orderAPizza(PizzaType.CHEESE, BranchLocation.CHICAGO);
        orderAPizza(PizzaType.CHICKEN, BranchLocation.CHICAGO);
        orderAPizza(PizzaType.PEPPERONI, BranchLocation.CHICAGO);
        orderAPizza(PizzaType.PINEAPPLE, BranchLocation.CHICAGO);
    }

    private static void orderAPizza(PizzaType pizzaType, BranchLocation branchLocation) {
        final PizzaStore pizzaStore = getPizzaStore(branchLocation);
        pizzaStore.orderPizza(pizzaType);
    }
    private static PizzaStore getPizzaStore(BranchLocation branchLocation) {
        final PizzaStore nyPizzaStore = SpringContext.getBean("nyPizzaStore");
        final PizzaStore chicagoPizzaStore = SpringContext.getBean("chicagoPizzaStore");

        switch (branchLocation) {
            case NY:
                return nyPizzaStore;
            case CHICAGO:
                return chicagoPizzaStore;
            default:
                throw new IllegalArgumentException("Unknown branch location!");
        }
    }
}
