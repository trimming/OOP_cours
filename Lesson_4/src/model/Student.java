package model;

import java.time.LocalDate;

public class Student extends User implements Comparable<Student>{
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
                "firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                "studentId=" + studentId +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}
