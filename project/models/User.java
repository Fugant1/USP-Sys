package models;

public class User extends Person {
    protected String name;
    protected String institute;
    protected int number;

    public User(String name, String institute, int number) {
        this.name = name;
        this.institute = institute;
        this.number = number;
    }

    @Override
    public String get_name() {
        return this.name;
    }

    protected int get_number() {
        return this.number;
    }

    protected String get_institute() {
        return this.institute;
    }
}
