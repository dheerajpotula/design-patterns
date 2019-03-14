import com.potulad.learning.designpatterns.command.remote.RemoteControl;
import com.potulad.learning.designpatterns.util.SpringContext;
import lombok.NonNull;

public class CommandPatternTest {

    public static void main(String args[]) {
        RemoteControl remoteControl = SpringContext.getBean("remoteControl");
        pressAllButtons(remoteControl);

    }

    private static void pressAllButtons(@NonNull RemoteControl remoteControl) {
        for(int i = 1; i <= 10; i++) {
            remoteControl.pressButton(i);
        }
    }
}
