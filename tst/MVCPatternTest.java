import com.potulad.learning.designpatterns.mvc.Student;
import com.potulad.learning.designpatterns.mvc.StudentController;
import com.potulad.learning.designpatterns.mvc.StudentView;

public class MVCPatternTest {
    public static void main(String args[]) {
        final Student model = new Student("Beyonce", 1213123L);
        final StudentView view = new StudentView();
        final StudentController studentController = new StudentController(model, view);

        studentController.display();

        studentController.setStudentName("JayZ");
        studentController.setStudentRollNumber(312412312L);
        studentController.display();

        studentController.setStudentName("LilWayne");
        studentController.setStudentRollNumber(41512312312L);
        studentController.display();
    }
}
