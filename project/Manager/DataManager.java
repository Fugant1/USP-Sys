package Manager;

import entities.Student;
import entities.Professor;

import java.util.List;

public class DataManager {
    private List<Student> students;
    private List<Professor> professors;

    public void add_student(String Name, String Email, String Institute, int Number, double Grade) {
        Student st = new Student(Name, Email, Institute, Number, Grade);
        students.add(st);
        System.out.println("Student added\n");
    }

    public void add_professor(String Name, String Email, String Institute, int Number, boolean isworking) {
        Professor pf = new Professor(Name, Email, Institute, Number, isworking);
        professors.add(pf);
        System.out.println("Professor added\n");
    }
}
