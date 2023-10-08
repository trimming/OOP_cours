import controller.TeacherController;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        TeacherController teacherController = new TeacherController();
        teacherController.create("Ivan", "Ivanov", "Petrovich",
                LocalDate.of(1987, 9, 17));
        teacherController.create("Petr", "Sidorov", "Ivanovich",
                LocalDate.of(1978, 4, 13));
        teacherController.changeInfoAboutTeacherFromTeachersList("Ivan", "Ivanov", "dateOfBirth", "2018-09-23");
        teacherController.printAllTeachers();
    }
}