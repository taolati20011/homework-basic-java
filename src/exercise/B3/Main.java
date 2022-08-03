package exercise.B3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 to add a Student");
            System.out.println("Enter 2 to show Student List");
            System.out.println("Enter 3 to search by ID");
            System.out.println("Enter 4 to close");
            String option = sc.nextLine();
            switch (option) {
                case "1": {
                    System.out.println("Enter a to add class A Student");
                    System.out.println("Enter b to add class B Student");
                    System.out.println("Enter c to add class C Student");
                    String type = sc.nextLine();

                    switch (type) {
                        case "a": {
                            System.out.println("Enter id:");
                            String id = sc.nextLine();
                            System.out.println("Enter name:");
                            String name = sc.nextLine();
                            System.out.println("Enter address:");
                            String address = sc.nextLine();
                            System.out.println("Enter level");
                            String level = sc.nextLine();
                            Student a = new A(id, name, address, level);
                            studentManager.add(a);
                            System.out.println(a.toString());
                            System.out.println("Press enter");
                            sc.nextLine();
                            break;
                        }
                        case "b": {
                            System.out.println("Enter id:");
                            String id = sc.nextLine();
                            System.out.println("Enter name:");
                            String name = sc.nextLine();
                            System.out.println("Enter address:");
                            String address = sc.nextLine();
                            System.out.println("Enter level");
                            String level = sc.nextLine();
                            Student b = new B(id, name, address, level);
                            studentManager.add(b);
                            System.out.println(b.toString());
                            System.out.println("Press enter");
                            sc.nextLine();
                            break;
                        }
                        case "c": {
                            System.out.println("Enter id:");
                            String id = sc.nextLine();
                            System.out.println("Enter name:");
                            String name = sc.nextLine();
                            System.out.println("Enter address:");
                            String address = sc.nextLine();
                            System.out.println("Enter level");
                            String level = sc.nextLine();
                            Student c = new C(id, name, address, level);
                            studentManager.add(c);
                            System.out.println(c.toString());
                            System.out.println("Press enter");
                            sc.nextLine();
                            break;
                        }
                    }
                    System.out.println("Enter again to return main");
                    sc.nextLine();
                    break;
                }
                case "2": {
                    System.out.println("Student List:");
                    studentManager.showStudentList();
                    System.out.println("Enter again to return main");
                    sc.nextLine();
                    break;
                }
                case "3": {
                    System.out.println("Enter id to search:");
                    String id = sc.nextLine();
                    studentManager.searchByID(id);
                    System.out.println("Enter again to return main");
                    sc.nextLine();
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    System.out.println("Enter again to return main");
                    sc.nextLine();
                    break;
            }
        }
    }
}
