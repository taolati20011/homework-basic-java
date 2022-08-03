package exercise.B2;

import javax.print.Doc;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 to add a Document");
            System.out.println("Enter 2 to remove a Document by id");
            System.out.println("Enter 3 to show list of Document");
            System.out.println("Enter 4 to show list of Document by type");
            System.out.println("Enter 5 to close");
            String option = sc.nextLine();
            switch (option) {
                case "1": {
                    System.out.println("Enter a to add a Book");
                    System.out.println("Enter b to add a Journal");
                    System.out.println("Enter c to add a Paper");
                    String type = sc.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.println("Enter id:");
                            String id = sc.nextLine();
                            System.out.println("Enter nxb:");
                            String nxb = sc.nextLine();
                            System.out.println("Enter number:");
                            int number = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter author:");
                            String author = sc.nextLine();
                            System.out.println("Enter total page number:");
                            int pageNumber = sc.nextInt();
                            sc.nextLine();
                            Document book = new Book(id, nxb, number, author, pageNumber);
                            manager.add(book);
                            System.out.println(book.toString());
                            sc.nextLine();
                            break;
                        }
                        case "b": {
                            System.out.println("Enter id:");
                            String id = sc.nextLine();
                            System.out.println("Enter nxb:");
                            String nxb = sc.nextLine();
                            System.out.println("Enter number:");
                            int number = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter release number:");
                            int releaseNum = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter month:");
                            int month = sc.nextInt();
                            sc.nextLine();
                            Document journal = new Journal(id, nxb, number, releaseNum, month);
                            manager.add(journal);
                            System.out.println(journal.toString());
                            sc.nextLine();
                            break;
                        }
                        case "c": {
                            System.out.println("Enter id:");
                            String id = sc.nextLine();
                            System.out.println("Enter nxb:");
                            String nxb = sc.nextLine();
                            System.out.println("Enter number:");
                            int number = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter day:");
                            int day = sc.nextInt();
                            sc.nextLine();
                            Document paper = new Paper(id, nxb, number, day);
                            manager.add(paper);
                            System.out.println(paper.toString());
                            sc.nextLine();
                            break;
                        }
                    }
                    System.out.println("Enter again to return main");
                    sc.nextLine();
                    break;
                }
                case "2": {
                    System.out.println("Enter id to delete a document:");
                    String id = sc.nextLine();
                    manager.deleteDocumentByID(id);
                    System.out.println("Enter again to return main");
                    sc.nextLine();
                    break;
                }
                case "3": {
                    manager.showDocument();
                    System.out.println("Enter again to return main");
                    sc.nextLine();
                    break;
                }
                case "4": {
                    manager.showDocumentEachType();
                    System.out.println("Enter again to return main");
                    sc.nextLine();
                    break;
                }
                case "5": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
