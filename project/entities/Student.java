package entities;

import models.User;

public class Student extends User {
    private double grade;

    public Student(String name, String institute, int number, double grade) {
        super(name, institute, number);
        this.grade = grade;
    }

    public double get_grade() {
        return this.grade;
    }

    public boolean isapproved() {
        return grade > 5;
    }
}
