import com.potulad.learning.designpatterns.adapter.DuckInterface;
import com.potulad.learning.designpatterns.adapter.Turkey;
import com.potulad.learning.designpatterns.util.SpringContext;

public class AdapterPatternTest {
    public static void main(String args[]) {
        final DuckInterface simpleDuck = SpringContext.getBean("simpleDuck");
        final DuckInterface turkeyAdapter = SpringContext.getBean("turkeyAdapter");

        final Turkey turkey = SpringContext.getBean("turkey");

        turkey.display();
        turkey.gobble();
        turkey.fly();
        System.out.println();

        doDuckStuff(simpleDuck);
        doDuckStuff(turkeyAdapter);
    }

    private static void doDuckStuff(DuckInterface duckInterface) {
        duckInterface.display();
        duckInterface.quack();
        duckInterface.fly();
        System.out.println();
    }
}
