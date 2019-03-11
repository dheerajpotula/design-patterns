import com.potulad.learning.designpatterns.strategy.duck.AbstractDuck;
import com.potulad.learning.designpatterns.strategy.duck.MallardDuck;
import com.potulad.learning.designpatterns.strategy.duck.RedheadDuck;
import com.potulad.learning.designpatterns.strategy.duck.RobotDuck;
import com.potulad.learning.designpatterns.util.SpringContext;
import lombok.NonNull;

public class StrategyPatternTest {
    public static void main(String args[]) {
        final MallardDuck mallardDuck = SpringContext.getBean("mallardDuck");
        final RedheadDuck redheadDuck = SpringContext.getBean("redheadDuck");
        final RobotDuck robotDuck = SpringContext.getBean("robotDuck");

        testDuck(mallardDuck, redheadDuck, robotDuck);
    }

    private static void testDuck(@NonNull AbstractDuck... abstractDucks) {
        for(AbstractDuck abstractDuck : abstractDucks) {
            abstractDuck.display();
            abstractDuck.fly();
            abstractDuck.quack();
            System.out.println();
        }

    }
}
