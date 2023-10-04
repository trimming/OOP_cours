import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Student student1 = new Student("Ivan", "Ivanov", "Ivanovich", LocalDate.of(2005, 7, 28), 123L);
    Student student2 = new Student("Roman", "Petrov", "Ivanovich", LocalDate.of(2004, 12, 28), 3L);
    Student student3 = new Student("Sergey", "Vetrov", "Petrovich", LocalDate.of(2005, 4, 8), 145L);
    Student student4 = new Student("Petr", "Petin", "Sergeevich", LocalDate.of(2005, 1, 19), 129L);
    Teacher teacher = new Teacher("Alexander", "Krushkin", "Michailovich", LocalDate.of(1983, 5, 9), 7573L);
    List<Student> studentList = new ArrayList<>(List.of(new Student[]{student1, student2, student3, student4}));
    StudentGroupIterator sgi = new StudentGroupIterator(studentList);


//    while (sgi.hasNext()){
//        System.out.println(sgi.next());
//    }
    StudentGroup studentGroup = new StudentGroup(studentList, teacher);
    for (Student student: studentGroup){
        System.out.println(student);
    }
    }
}