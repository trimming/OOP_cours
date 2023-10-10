package controller;

import model.*;
import service.DataService;
import service.StudentGroupService;
import view.StudentView;

import java.time.LocalDate;
import java.util.List;

public class Controller {
    private  final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();
    private  final StudentGroupService studentGroupService = new StudentGroupService();

    public void createStudent(String firstName, String secondName,
                              String lastName, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, lastName, dateOfBirth, Type.STUDENT);
    }
    public void createTeacher(String firstName, String secondName,
                              String lastName, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, lastName, dateOfBirth, Type.TEACHER);
    }
    public void getAllStudent(){
        List<User> userList = dataService.getAllStudents();
        for(User user: userList){
            studentView.sendOnConsole((Student) user);
        }
    }
    public Teacher getTeacher(){
        return (Teacher) dataService.getTeacher();
    }
    public void createStudentGroup(List<Student> studentList, Teacher teacher){
        studentGroupService.createStudentGroup(studentList, teacher);
    }
}
