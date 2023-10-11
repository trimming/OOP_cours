package model;

import java.time.LocalDate;

public class Teacher extends User{
    private int teacherId;

    public Teacher(String firstName, String secondName, String lastName, LocalDate dateOfBirth, int teacherId) {
        super(firstName, secondName, lastName, dateOfBirth);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                " firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                '}';
    }
}
