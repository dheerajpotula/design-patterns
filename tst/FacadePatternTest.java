import com.potulad.learning.designpatterns.facade.HomeTheatre;
import com.potulad.learning.designpatterns.facade.LightRemote;
import com.potulad.learning.designpatterns.facade.PopcornMachine;
import com.potulad.learning.designpatterns.facade.SpeakerSystem;
import com.potulad.learning.designpatterns.facade.TV;
import com.potulad.learning.designpatterns.util.SpringContext;

public class FacadePatternTest {
    public static void main(String args[]) {
        final HomeTheatre homeTheatre = SpringContext.getBean("homeTheatre");

        final TV tv = SpringContext.getBean("tv");
        final SpeakerSystem speakerSystem = SpringContext.getBean("speakerSystem");
        final PopcornMachine popcornMachine = SpringContext.getBean("popcornMachine");
        final LightRemote lightRemote = SpringContext.getBean("lightRemote");

        // Facade to simplify stuff
        homeTheatre.prepForMovie();
        System.out.println();

        homeTheatre.turnOffMovie();
        System.out.println();

        // Accessing individual systems is still possible
        speakerSystem.on();
        popcornMachine.on();
        speakerSystem.off();
    }
}
