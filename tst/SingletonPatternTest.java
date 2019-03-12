import com.potulad.learning.designpatterns.singleton.SingletonExample;
import com.potulad.learning.designpatterns.util.SpringContext;
import org.junit.Assert;

/**
 * Test singleton creation. (Not sure if this is a accurate test).
 *
 * TODO: Find a better way to test Singleton creation.
 */
public class SingletonPatternTest {
    public static void main(String args[]) {
        SingletonExample singletonExample1 = SpringContext.getBean("singleton1");
        SingletonExample singletonExample2 = SpringContext.getBean("singleton2");
        SingletonExample singletonExample3 = SingletonExample.getUniqueInstance();

        Assert.assertEquals(singletonExample1.getUniqueInstance(), singletonExample2.getUniqueInstance());
        Assert.assertEquals(singletonExample2.getUniqueInstance(), singletonExample3);
    }
}
