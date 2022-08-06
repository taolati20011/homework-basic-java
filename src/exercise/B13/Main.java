package exercise.B13;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManager em = new EmployeeManager();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 to insert an employee");
            System.out.println("Enter 2 to search employee by id");
            System.out.println("Enter 3 to delete employee by id");
            System.out.println("Enter 4 to search employee by type");
            System.out.println("Enter 5 to close program");
            String option = sc.nextLine();
            switch (option) {
                case "1": {
                    System.out.println("Enter type to insert: 0 - Intern, 1 - Fresher, 2 - Experience:");
                    int type = sc.nextInt();
                    sc.nextLine();
                    em.insert(type);
                    break;
                }
                case "2": {
                    System.out.println("Enter id to search:");
                    String id = sc.nextLine();
                    if (em.findById(id)==null) {
                        System.out.println("No employee found");
                        break;
                    }
                    System.out.println(em.findById(id).showInfo());;
                    break;
                }
                case "3": {
                    System.out.println("Enter id to delete:");
                    String id = sc.nextLine();
                    em.deleteById(id);
                    break;
                }
                case "4": {
                    System.out.println("Enter type to search:");
                    String type = sc.nextLine();
                    em.findByType(type).forEach(o -> System.out.println(o.showInfo()));
                    break;
                }
                case "5": {
                    System.out.println("Program closed");
                    System.exit(0);
                }
            }
        }
    }
}
