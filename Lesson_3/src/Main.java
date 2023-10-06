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
        Teacher teacher1 = new Teacher("Alexander", "Krushkin", "Michailovich", LocalDate.of(1983, 5, 9), 7573L);
        List<Student> studentList1 = new ArrayList<>(List.of(new Student[]{student1, student2, student3, student4}));
        
        Student student5 = new Student("Stepan", "Ovanov", "Romanovich", LocalDate.of(2006, 7, 28), 13L);
        Student student6 = new Student("Romanio", "Petros", "Ivanovich", LocalDate.of(2006, 12, 28), 73L);
        Student student7 = new Student("Sergio", "Vetrin", "Petrovich", LocalDate.of(2007, 4, 8), 1645L);
        Student student8 = new Student("Petrio", "Petinov", "Sergeevich", LocalDate.of(2006, 1, 19), 29L);
        Teacher teacher2 = new Teacher("Alex", "Krushin", "Michailovich", LocalDate.of(1986, 5, 9), 573L);
        List<Student> studentList2 = new ArrayList<>(List.of(new Student[]{student5, student6, student7, student8}));

        StudentGroup studentGroup1 = new StudentGroup(studentList1, teacher1);
        StudentGroup studentGroup2 = new StudentGroup(studentList2, teacher2);
        
        List<StudentGroup> studentGroupList1 = new ArrayList<>(List.of(new StudentGroup[]{studentGroup1, studentGroup2}));
        Stream stream1 = new Stream(studentGroupList1);

        Student student9 = new Student("Vasiliy", "Zverev", "Ivanovich", LocalDate.of(2004, 4, 20), 3123L);
        Student student10 = new Student("Foma", "Osetrov", "Fomich", LocalDate.of(2004, 1, 28), 33L);
        Student student11 = new Student("Semen", "Petrov", "Semenovich", LocalDate.of(2004, 4, 18), 3145L);
        Student student12 = new Student("Platon", "Petkin", "Victorovich", LocalDate.of(2004, 1, 9), 3129L);
        Teacher teacher3 = new Teacher("Evgeniy", "Monastyrev", "Anatolevich", LocalDate.of(1983, 5, 8), 37573L);
        List<Student> studentList3 = new ArrayList<>(List.of(new Student[]{student9, student10, student11, student12}));
        
        StudentGroup studentGroup3 = new StudentGroup(studentList3, teacher3);
                
        List<StudentGroup> studentGroupList2 = new ArrayList<>(List.of(new StudentGroup[]{studentGroup3}));
        Stream stream2 = new Stream(studentGroupList2);
        
//
        List<Stream> streamList = new ArrayList<>(List.of(new Stream[]{stream2, stream1}));
       StreamService streamService = new StreamService(streamList);
       streamService.getSortedBySizeStream();
       for (Stream stream: streamList){
           System.out.println(stream);
       }
    }
}
