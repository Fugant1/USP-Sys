package entities;

import models.User;

public class Professor extends User {
    private boolean isWorking;

    public Professor(String name, String institute, int number, boolean isWorking) {
        super(name, institute, number);
        this.isWorking = isWorking;
    }

    public boolean isprofessorON() {
        return this.isWorking;
    }
}
