import java.time.LocalDate;

public class Teacher extends User {
    private Long teacherId;

    public Teacher(String firstName, String secondName, String lastName, LocalDate dateOfBirth, Long teacherId) {
        super(firstName, secondName, lastName, dateOfBirth);
        this.teacherId = teacherId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

}
