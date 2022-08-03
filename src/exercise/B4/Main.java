package exercise.B4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Town town = new Town();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= number; i++) {
            System.out.println("Family " + i);
            System.out.println("Enter number of people:");
            int numberPerson = sc.nextInt();
            System.out.println("Enter address number:");
            int addrNumber = sc.nextInt();
            sc.nextLine();
            Family family = new Family(numberPerson, addrNumber);
            for (int j = 1; j <= numberPerson; j++) {
                System.out.println("Enter Person number" + j);
                System.out.println("Enter name:");
                String name = sc.nextLine();
                System.out.println("Enter age:");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter job:");
                String job = sc.nextLine();
                System.out.println("Enter id:");
                String id = sc.nextLine();
                Person person = new Person(name, age, job, id);
                family.personList.add(person);
            }
            town.familyList.add(family);
        }
        System.out.println(town.toString());
    }
}
