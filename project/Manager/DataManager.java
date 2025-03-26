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

    public void get_student_by_number(int number) {
        for (Student st : students) {
            if (st.get_number() == number) {
                System.out.println("Name: " + st.get_name() + "\n Email: " + st.get_email() + "\n Institute: " + st.get_institute());
                if(st.isapproved()) {
                    System.out.println("\n Approved\n");
                    break;
                }
                System.out.println("Not Approved\n");
                break;
            }
        }
    }

    public void get_professor_by_number(int number) {
        for (Professor pf : professors) {
            if (pf.get_number() == number) {
                System.out.println("Name: " + pf.get_name() + "\n Email: " + pf.get_email() + "\n Institute: " + pf.get_institute());
                if(pf.isprofessorON()) {
                    System.out.println("\nThis professor is Working nowadays\n");
                    break;
                }
                System.out.println("This professor is not currently Working at this institute\n");
                break;
            }
        }
    }
}
