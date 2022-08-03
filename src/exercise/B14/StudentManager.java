package exercise.B14;

import exercise.B14.Exception.InvalidDOBException;
import exercise.B14.Exception.InvalidFullNameException;
import exercise.B14.Exception.InvalidPhoneNumberException;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentManager {
    private List<Student> studentList;
    ExceptionCheck ec = new ExceptionCheck();
    Scanner sc = new Scanner(System.in);

    public void insert(int type) {
        if (type == 0) {
            insertNormalStudent();
            return;
        }
        if (type == 1) {
            insertGoodStudent();
            return;
        }
        return;
    }

    public void checkValidStudent(String name, String dob, String number) {
        try {
            ec.InvalidFullNameException(name);
            ec.InvalidDOBException(dob);
            ec.InvalidPhoneNumberException(number);
        } catch (InvalidFullNameException e) {

        } catch (InvalidDOBException e) {

        } catch (InvalidPhoneNumberException e) {

        } catch (Exception e) {
            System.out.println("Input files have unknown errors !!!");
        }
    }

    public void insertNormalStudent()  {
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter DoB:");
        String dob = sc.nextLine();
        System.out.println("Enter sex:");
        String sex = sc.nextLine();
        System.out.println("Enter phone number:");
        String number = sc.nextLine();
        System.out.println("Enter univerity name:");
        String univerisy = sc.nextLine();
        System.out.println("Enter grade level:");
        int level = sc.nextInt();
        System.out.println("Enter english score:");
        double englishScore = sc.nextDouble();
        System.out.println("Enter entry test score:");
        double testScore = sc.nextDouble();
        checkValidStudent(name, dob, number);
        Student normalStudent = new NormalStudent(name, dob, sex, number, univerisy, level, englishScore, testScore);
        studentList.add(normalStudent);
    }

    public void insertGoodStudent() {
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter DoB:");
        String dob = sc.nextLine();
        System.out.println("Enter sex:");
        String sex = sc.nextLine();
        System.out.println("Enter phone number:");
        String number = sc.nextLine();
        System.out.println("Enter univerity name:");
        String univerisy = sc.nextLine();
        System.out.println("Enter grade level:");
        int level = sc.nextInt();
        System.out.println("Enter gpa:");
        double gpa = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter best reward:");
        String bestRewardName = sc.nextLine();
        checkValidStudent(name, dob, number);
        Student goodStudent = new GoodStudent(name, dob, sex, number, univerisy, level, gpa, bestRewardName);
        studentList.add(goodStudent);
    }

    public List<GoodStudent> getSortedGoodStudent (List<GoodStudent> list) {
        return list.stream().sorted(Comparator.comparing(GoodStudent::getGpa).reversed()
                .thenComparing(GoodStudent::getLastName)).collect(Collectors.toList());
    }

    public List<NormalStudent> getSortedNormalStudent(List <NormalStudent> list) {
        return list.stream().sorted(Comparator.comparing(NormalStudent::getEnglishScore).reversed()
                .thenComparing(NormalStudent::getLastName)).collect(Collectors.toList());
    }

    public void showAll(List<GoodStudent> list) {
        List<Student> allStudent = list.stream().sorted(Comparator.comparing(Student::getFullName)
                .thenComparing(Student::getPhoneNumber)).collect(Collectors.toList());
        allStudent.forEach(o -> System.out.println(o.getFullName() + o.getPhoneNumber()));
    }


}
