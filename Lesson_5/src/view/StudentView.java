package view;

import model.Student;
import model.User;

public class StudentView<T extends User> {

    public void sendOnConsole(T user){

        System.out.println(user.toString());
    }
}
