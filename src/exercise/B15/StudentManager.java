package exercise.B15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    List<Student> studentList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void insert(int type) {
        if (type == 0) {
            insertStudent();
            return;
        }
        if (type == 1) {
            insertStudent1();
            return;
        }
        return;
    }

    public void insertStudent() {
        System.out.println("Enter id:");
        String id = sc.nextLine();
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter dob");
        String dob = sc.nextLine();
        System.out.println("Enter year:");
        String year = sc.nextLine();
        System.out.println("Enter grade:");
        String grade = sc.nextLine();
        Student student = new Student(id, name, dob, year, grade);
        this.studentList.add(student);
    }

    public void insertStudent1() {
        System.out.println("Enter id:");
        String id = sc.nextLine();
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter dob");
        String dob = sc.nextLine();
        System.out.println("Enter year:");
        String year = sc.nextLine();
        System.out.println("Enter grade:");
        String grade = sc.nextLine();
        Student student = new Student(id, name, dob, year, grade);
        this.studentList.add(student);

    }
}
