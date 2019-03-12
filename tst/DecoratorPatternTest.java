import com.potulad.learning.designpatterns.decorator.beverage.Beverage;
import com.potulad.learning.designpatterns.decorator.beverage.DarkRoast;
import com.potulad.learning.designpatterns.decorator.beverage.HouseBlend;
import com.potulad.learning.designpatterns.decorator.beverage.Mocha;
import com.potulad.learning.designpatterns.decorator.condiment.Cinnamon;
import com.potulad.learning.designpatterns.decorator.condiment.VanillaCream;
import com.potulad.learning.designpatterns.decorator.condiment.WhippedCream;

public class DecoratorPatternTest {
    public static void main(String args[]) {
        // House Blend with Cinnamon and Whipped Cream
        Beverage beverage = new WhippedCream(new Cinnamon(new HouseBlend()));
        printBeverage(beverage);

        // Dark Roast with Double Vanilla Cream
        Beverage beverage1 = new VanillaCream(new VanillaCream(new DarkRoast()));
        printBeverage(beverage1);


        // Moch with double Cinnamon, double Vanilla Cream, double Whipped Cream (yuck!)
        Beverage beverage2 =
                new Cinnamon(new Cinnamon(new VanillaCream(new VanillaCream(new WhippedCream(new WhippedCream(new Mocha()))))));
        printBeverage(beverage2);
    }

    private static void printBeverage(Beverage beverage) {
        System.out.println(beverage.getCost());
        System.out.println(beverage.getDescription());
        System.out.println();
    }
}
