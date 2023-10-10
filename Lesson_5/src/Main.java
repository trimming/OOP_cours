import controller.Controller;
import model.Teacher;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.createStudent("F", "S", "D", LocalDate.of(1987, 8, 12));
        controller.createStudent("Fcv", "Sbn", "Do", LocalDate.of(1988, 4, 19));
        controller.createStudent("Fsd", "Shj", "Dpi", LocalDate.of(1986, 2, 24));
        controller.createTeacher("vb", "we", "qw", LocalDate.of(10, 24, 1978));
        controller.getAllStudent();
        controller.createStudentGroup(controller.getAllStudent(), controller.getTeacher());
    }
}