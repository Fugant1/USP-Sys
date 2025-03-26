package entities;

import models.User;

public class Professor extends User {
    private final boolean isWorking;

    public Professor(String name, String email, String institute, int number, boolean isWorking) {
        super(name, email, institute, number);
        this.isWorking = isWorking;
    }

    public boolean isprofessorON() {
        return this.isWorking;
    }
}
