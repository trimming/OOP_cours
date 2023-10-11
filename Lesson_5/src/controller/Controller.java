package controller;

import model.*;
import service.DataService;
import service.StudentGroupService;
import view.StudentView;

import java.time.LocalDate;
import java.util.ArrayList;
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
    public void getAll(){
        List<User> userList = dataService.getAll();
        for(User user: userList){
            studentView.sendOnConsole(user);
        }
    }


    public void createStudentGroup(Type type, int id){
        List<User> userList = dataService.getAllStudents();
        List<Student> resList = new ArrayList<>();
        for(User user: userList){
            resList.add((Student) user);
        }
        Teacher teacher = (Teacher) dataService.getUserById(Type.TEACHER, id);
        studentGroupService.createStudentGroup(resList, teacher);
        StudentGroup studentGroup = studentGroupService.getStudentGroup();
        System.out.println(studentGroup.toString());
    }
}
