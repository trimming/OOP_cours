package service;

import model.Student;
import model.StudentGroup;
import model.Teacher;

import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;
    public void createStudentGroup(List<Student> studentList, Teacher teacher){
        this.studentGroup = new StudentGroup(studentList, teacher);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }
}
