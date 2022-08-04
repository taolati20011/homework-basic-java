package exercise.B14;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 to add a Student");
            System.out.println("Enter 2 to get list sorted Student passed");
            System.out.println("Enter 3 to get list of student");
            String option = sc.nextLine();
            switch (option) {
                case "1": {
                    int type = sc.nextInt();
                    sc.nextLine();
                    sm.insert(type);
                    break;
                }
                case "2": {
                    System.out.println("Enter num of students:");
                    int n = sc.nextInt();
                    sc.nextLine();
                    sm.getSortedStudent(sm.getStudentList(), n).forEach(o -> System.out.println(o.getFullName()));
                    break;
                }
                case "3": {
                    sm.showAll(sm.getStudentList());
                    break;
                }
            }
        }
    }
}
