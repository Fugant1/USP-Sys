package Manager;

import entities.Student;
import entities.Professor;

import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private List<Student> students;
    private List<Professor> professors;

    public DataManager() {
        this.students = new ArrayList<Student>();
        this.professors = new ArrayList<>();
    }

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

    private Student get_student_by_number(int number) {
        for (Student st : students) {
            if (st.get_number() == number) {
                return st;
            }
            System.out.println("Student not found in the database\n");
        }
        return null;
    }

    private Professor get_professor_by_number(int number) {
        for (Professor pf : professors) {
            if (pf.get_number() == number) {
                return pf;
            }
            System.out.println("professor not found in the data base\n");
        }
        return null;
    }

    public void list_professors_per_institute(String institute) {
        if (professors.isEmpty()) {
            System.out.println("No professors found");
            return;
        }

        int flag = 0;

        System.out.println("Professors that works in " + institute + ":\n");
        for (Professor pf : professors) {
            if (pf.get_institute().equals(institute)) {
                flag = 1;
                System.out.println(pf.get_name() + "\nemail for contact: " + pf.get_email() + "\n");
            }
        }
        if (flag == 0) {
            System.out.println("No professors found");
        }
    }
}
