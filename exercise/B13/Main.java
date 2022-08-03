package exercise.B13;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManager em = new EmployeeManager();
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
        while (true) {
            System.out.println("Enter 1 to insert an employee");
            System.out.println("Enter 2 to search");
            System.out.println("Enter 3 to delete employee by id");
            System.out.println("Enter 4 to search employee by type");
            System.out.println("Enter 5 to close program");
            switch (option) {
                case "1": {
                    int type = sc.nextInt();
                    //.....................
                }
            }
        }
    }
}
