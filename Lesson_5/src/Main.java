import controller.Controller;
import model.Student;
import model.Teacher;
import model.Type;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();

        controller.createStudent("F", "S", "D", LocalDate.of(1987, 8, 12));
        controller.createStudent("Fcv", "Sbn", "Do", LocalDate.of(1988, 4, 19));
        controller.createStudent("Fsd", "Shj", "Dpi", LocalDate.of(1986, 2, 24));
        controller.createTeacher("vb", "we", "qw", LocalDate.of(1980, 4, 18));
        controller.getAll();
        controller.createStudentGroup(Type.TEACHER, 1);
        Controller controller1 = new Controller();
        controller1.createStudent("Fedor", "Surin", "Denisovich", LocalDate.of(1997, 9, 17));
        controller1.createStudent("Fcviy", "Sibn", "Dorich", LocalDate.of(1998, 7, 29));
        controller1.createStudent("Fsdir", "Uohj", "Dpi", LocalDate.of(1996, 6, 14));
        controller1.createTeacher("Aveb", "Pwe", "Iqw", LocalDate.of(1960, 9, 28));
        controller1.getAll();
        controller1.createStudentGroup(Type.TEACHER, 1);

    }
}