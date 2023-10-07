package controller;

import java.time.LocalDate;

public interface UserController {
    void create(String firstName, String secondName, String lastName, LocalDate dateOfBirth);
}
