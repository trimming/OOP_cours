package service;

import model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student>{
    private final List<Student> studentList;

    public StudentService() {
        this.studentList = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return studentList;
    }

    @Override
    public void create(String firstName, String secondName, String lastName, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for(Student student: studentList){
            if(student.getStudentId() > countMaxId){
                countMaxId = student.getStudentId();
            }
        }
        countMaxId++;
        Student student = new Student(firstName, secondName, lastName, dateOfBirth, countMaxId);
        studentList.add(student);
    }
}
