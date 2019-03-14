import com.potulad.learning.designpatterns.command.devices.CeilingFan;
import com.potulad.learning.designpatterns.command.devices.GarageDoor;
import com.potulad.learning.designpatterns.command.devices.Light;
import com.potulad.learning.designpatterns.command.devices.MusicSystem;
import com.potulad.learning.designpatterns.command.remote.RemoteControl;
import com.potulad.learning.designpatterns.util.SpringContext;
import lombok.NonNull;

public class CommandPatternTest {

    public static void main(String args[]) {
        final RemoteControl remoteControl = SpringContext.getBean("remoteControl");
        pressAllButtons(remoteControl);

        final GarageDoor garageDoor = new GarageDoor();
        final Light light = new Light();
        final MusicSystem musicSystem = new MusicSystem();
        final CeilingFan ceilingFan = new CeilingFan();

        remoteControl.changeSlot(7, garageDoor::up);
        remoteControl.changeSlot(8, garageDoor::up);
        pressAllButtons(remoteControl);

        remoteControl.changeSlot(1, () -> {
            garageDoor.up();
            light.turnOn();
            musicSystem.on();
            musicSystem.setVolume(100);
            ceilingFan.on();
            ceilingFan.off();
        });
        pressAllButtons(remoteControl);
    }

    private static void pressAllButtons(@NonNull RemoteControl remoteControl) {
        for(int i = 1; i <= 10; i++) {
            remoteControl.pressButton(i);
        }
        System.out.println("\n");
    }
}
