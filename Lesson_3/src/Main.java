import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "Ivanov", "Ivanovich", LocalDate.of(2005, 7, 28), 123L);
        Student student2 = new Student("Roman", "Petrov", "Ivanovich", LocalDate.of(2004, 12, 28), 3L);
        Student student3 = new Student("Sergey", "Vetrov", "Petrovich", LocalDate.of(2005, 4, 8), 145L);
        Student student4 = new Student("Petr", "Petin", "Sergeevich", LocalDate.of(2005, 1, 19), 129L);
        Teacher teacher = new Teacher("Alexander", "Krushkin", "Michailovich", LocalDate.of(1983, 5, 9), 7573L);
        List<Student> studentList = new ArrayList<>(List.of(new Student[]{student1, student2, student3, student4}));
        Student student5 = new Student("Stepan", "Ovanov", "Romanovich", LocalDate.of(2006, 7, 28), 13L);
        Student student6 = new Student("Romanio", "Petros", "Ivanovich", LocalDate.of(2006, 12, 28), 73L);
        Student student7 = new Student("Sergio", "Vetrin", "Petrovich", LocalDate.of(2007, 4, 8), 1645L);
        Student student8 = new Student("Petrio", "Petinov", "Sergeevich", LocalDate.of(2006, 1, 19), 29L);
        Teacher teacher1 = new Teacher("Alex", "Krushin", "Michailovich", LocalDate.of(1986, 5, 9), 573L);
        List<Student> studentList1 = new ArrayList<>(List.of(new Student[]{student5, student6, student7, student8}));
        StudentGroupIterator sgi = new StudentGroupIterator(studentList);

//    while (sgi.hasNext()){
//        System.out.println(sgi.next());
//    }
        Collections.sort(studentList, new StudentComparator());
//        for (Student student : studentList) {
//            System.out.println(student);
//        }
        StudentGroup studentGroup = new StudentGroup(studentList, teacher);
        StudentGroup studentGroup1 = new StudentGroup(studentList1, teacher1);
//    for (Student student: studentGroup){
//        System.out.println(student);
//    }
        List<StudentGroup> studentGroupList = new ArrayList<>(List.of(new StudentGroup[]{studentGroup, studentGroup1}));
       Stream stream = new Stream(studentGroupList);
       for (StudentGroup group: stream){
           System.out.println(group);
       }
    }
}