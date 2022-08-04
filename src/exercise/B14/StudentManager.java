package exercise.B14;

import exercise.B14.Exception.InvalidDOBException;
import exercise.B14.Exception.InvalidFullNameException;
import exercise.B14.Exception.InvalidPhoneNumberException;
import exercise.B3.A;

import java.util.*;
import java.util.stream.Collectors;

public class StudentManager {
    private List<Student> studentList = new ArrayList<>();
    ExceptionCheck ec = new ExceptionCheck();
    Scanner sc = new Scanner(System.in);

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

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

    public void insertNormalStudent()  {
        try {
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
            sc.nextLine();
            System.out.println("Enter entry test score:");
            double testScore = sc.nextDouble();
            sc.nextLine();
            Student normalStudent = new NormalStudent(name, dob, sex, number, univerisy, level, englishScore, testScore);
            studentList.add(normalStudent);
            ec.InvalidFullNameException(name);
            ec.InvalidDOBException(dob);
            ec.InvalidPhoneNumberException(number);
        } catch (InvalidFullNameException e) {
            this.studentList.remove(studentList.size()-1);
            System.out.println("Invalid name");
        } catch (InvalidDOBException e) {
            this.studentList.remove(studentList.size()-1);
            System.out.println("Invalid dob");
        } catch (InvalidPhoneNumberException e) {
            this.studentList.remove(studentList.size()-1);
            System.out.println("Invalid phone number");
        } catch (Exception e) {
            this.studentList.remove(studentList.size()-1);
            System.out.println("Input files have unknown errors !!!");
        }
    }

    public void insertGoodStudent() {
        try {
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
            sc.nextLine();
            System.out.println("Enter gpa:");
            double gpa = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter best reward:");
            String bestRewardName = sc.nextLine();
            Student goodStudent = new GoodStudent(name, dob, sex, number, univerisy, level, gpa, bestRewardName);
            studentList.add(goodStudent);
            ec.InvalidFullNameException(name);
            ec.InvalidDOBException(dob);
            ec.InvalidPhoneNumberException(number);
        } catch (InvalidFullNameException e) {
            this.studentList.remove(studentList.size()-1);
            System.out.println("Invalid name");
        } catch (InvalidDOBException e) {
            this.studentList.remove(studentList.size()-1);
            System.out.println("Invalid dob");
        } catch (InvalidPhoneNumberException e) {
            this.studentList.remove(studentList.size()-1);
            System.out.println("Invalid phone number");
        } catch (Exception e) {
            System.out.println("Input files have unknown errors !!!");
        }
    }

    public List<GoodStudent> getSortedGoodStudent (List<GoodStudent> list, int n) {
        return list.stream().sorted(Comparator.comparing(GoodStudent::getGpa).reversed()
                .thenComparing(GoodStudent::getLastName)).limit(n).collect(Collectors.toList());
    }

    public List<NormalStudent> getSortedNormalStudent(List <NormalStudent> list, int n) {
        return list.stream().sorted(Comparator.comparing(NormalStudent::getEnglishScore).reversed()
                .thenComparing(NormalStudent::getLastName)).limit(n).collect(Collectors.toList());
    }

    public List<Student> getSortedStudent(List<Student> list, int n) {
        List<Student> goodStudentList = list.stream().filter(o -> o instanceof GoodStudent).collect(Collectors.toList());
        List<Student> normalStudentList = list.stream().filter(o -> o instanceof NormalStudent).collect(Collectors.toList());

        List<GoodStudent> goodStudentList1 = new ArrayList<>();
        goodStudentList.stream().forEach(o -> {
            goodStudentList1.add(new GoodStudent(o));
        });

        List<Student> res = goodStudentList1.stream().sorted(Comparator.comparing(GoodStudent::getGpa).reversed()
                .thenComparing(GoodStudent::getLastName)).limit(n).collect(Collectors.toList());

        if (goodStudentList.size() >= n) {
            return res;
        }

        List<NormalStudent> normalStudentList1 = new ArrayList<>();
        normalStudentList.stream().forEach(o -> {
            normalStudentList1.add(new NormalStudent(o));
        });

        List<Student> res2 = normalStudentList1.stream().sorted(Comparator.comparing(NormalStudent::getEnglishScore).reversed()
                .thenComparing(NormalStudent::getLastName)).limit(n-goodStudentList.size()).collect(Collectors.toList());

        res.addAll(res2);
        return res;

    }

    public void showAll(List<Student> list) {
        List<Student> allStudent = list.stream().sorted(Comparator.comparing(Student::getFullName)
                .thenComparing(Student::getPhoneNumber)).collect(Collectors.toList());
        allStudent.forEach(o -> System.out.println(o.getFullName() + o.getPhoneNumber()));
    }


}
