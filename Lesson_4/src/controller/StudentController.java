package controller;

import model.Student;
import model.Teacher;
import service.StudentGroupService;
import service.StudentService;
import view.StudentView;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class StudentController implements UserController<Student>{
    private final StudentService dataService = new StudentService();
    private  final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView studentView = new StudentView();

    @Override
    public void create(String firstName, String secondName, String lastName, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, lastName, dateOfBirth);
        studentView.sendOnConsole(dataService.getAll());
    }
    public void createStudentGroup(List<Student> studentList, Teacher teacher){
        studentGroupService.createStudentGroup(studentList, teacher);
        studentView.sendOnConsoleUserGroup(studentGroupService.getStudentGroup());
    }
    public void getStudentInStudentGroup(String firstName, String secondName){
        Student student = studentGroupService.getStudentFromStudentGroup(firstName, secondName);
        studentView.sendOnConsole(Collections.singletonList(student));
    }
    public void getSortedListStudentFromStudentGroup(){
        List<Student> students = studentGroupService.getSortedStudentGroup();
        studentView.sendOnConsole(students);
    }
    public void getSortedListByFIOStudentFromStudentGroup(){
        List<Student> students = studentGroupService.getSortedByFIOStudentGroup();
        studentView.sendOnConsole(students);
    }
}
