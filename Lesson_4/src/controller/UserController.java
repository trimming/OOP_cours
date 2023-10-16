package controller;

import model.User;

import java.time.LocalDate;

public interface UserController <T extends User>{
    void create(String firstName, String secondName, String lastName, LocalDate dateOfBirth);
}
