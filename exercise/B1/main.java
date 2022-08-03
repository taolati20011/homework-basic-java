package exercise.B1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OfficerManager officerManager = new OfficerManager();

        while (true) {
            System.out.println("Enter 1 to add a new officer");
            System.out.println("Enter 2 to search officer by name");
            System.out.println("Enter 3 to show list officer");
            System.out.println("Enter 4 to close");
            String option = sc.nextLine();
            switch (option) {
                case "1": {
                    System.out.println("Enter a to add a Engineer");
                    System.out.println("Enter b to add a Worker");
                    System.out.println("Enter c to add a Staff");
                    String type = sc.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.println("Enter name: ");
                            String name = sc.nextLine();
                            System.out.println("Enter age: ");
                            int age = sc.nextInt();
                            System.out.println("Enter gender");
                            sc.nextLine();
                            String gender = sc.nextLine();
                            System.out.println("Enter address");
                            String address = sc.nextLine();
                            System.out.println("Enter branch:");
                            String branch = sc.nextLine();
                            Officer engineer = new Engineer(name, age, gender, address, branch);
                            officerManager.add(engineer);
                            System.out.println(engineer.toString());
                            sc.nextLine();
                            break;
                        }
                        case "b": {
                            System.out.println("Enter name: ");
                            String name = sc.nextLine();
                            System.out.println("Enter age: ");
                            int age = sc.nextInt();
                            System.out.println("Enter gender");
                            sc.nextLine();
                            String gender = sc.nextLine();
                            System.out.println("Enter address");
                            String address = sc.nextLine();
                            System.out.println("Enter level:");
                            int level = sc.nextInt();
                            Officer worker = new Worker(name, age, gender, address, level);
                            officerManager.add(worker);
                            System.out.println(worker.toString());
                            sc.nextLine();
                            break;
                        }
                        case "c": {
                            System.out.println("Enter name: ");
                            String name = sc.nextLine();
                            System.out.println("Enter age: ");
                            int age = sc.nextInt();
                            System.out.println("Enter gender");
                            sc.nextLine();
                            String gender = sc.nextLine();
                            System.out.println("Enter address");
                            String address = sc.nextLine();
                            System.out.println("Enter job:");
                            String job = sc.nextLine();
                            Officer staff = new Staff(name, age, gender, address, job);
                            officerManager.add(staff);
                            System.out.println(staff.toString());
                            sc.nextLine();
                            break;
                        }
                    }
                    System.out.println("Enter again to return main:");
                    sc.nextLine();
                    break;
                }
                case "2": {
                    System.out.println("Search officer by name:");
                    String name = sc.nextLine();
                    officerManager.searchOfficerByName(name).forEach(officer -> {
                        System.out.println(officer.toString());
                    });
                    System.out.println("Enter again to return main:");
                    sc.nextLine();
                    break;
                }
                case "3": {
                    officerManager.showListOfficer();
                    System.out.println("Enter again to return main:");
                    sc.nextLine();
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    System.out.println("Enter again to return main:");
                    continue;
            }
        }
    }
}
