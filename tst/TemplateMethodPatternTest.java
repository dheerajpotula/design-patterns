import com.potulad.learning.designpatterns.templatemethod.BeverageMaker;
import com.potulad.learning.designpatterns.templatemethod.BeveragePreparation;

public class TemplateMethodPatternTest {
    public static void main(String args[]) {
        BeveragePreparation coffeePreparation = BeverageMaker.getBeverage(BeverageMaker.BeverageType.COFFEE);
        BeveragePreparation teaPreparation = BeverageMaker.getBeverage(BeverageMaker.BeverageType.TEA);

        coffeePreparation.makeBeverage();
        System.out.println();

        teaPreparation.makeBeverage();

    }
}
