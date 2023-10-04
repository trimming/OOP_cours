import java.time.LocalDate;

public class Student extends User {
    private Long studentId;

    public Student(String firstName, String secondName, String lastName, LocalDate dateOfBirth, Long studentId) {
        super(firstName, secondName, lastName, dateOfBirth);
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                '}';
    }
}
