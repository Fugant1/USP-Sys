package models;

public class User extends Person {
    protected String name;
    protected String email;
    protected String institute;
    protected int number;

    public User(String name, String email, String institute, int number) {
        this.name = name;
        this.email = email;
        this.institute = institute;
        this.number = number;
    }

    @Override
    public String get_name() {
        return this.name;
    }

    public String get_email() { return this.email; }

    protected int get_number() {
        return this.number;
    }

    protected String get_institute() {
        return this.institute;
    }
}
