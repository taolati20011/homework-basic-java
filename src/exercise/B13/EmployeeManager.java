package exercise.B13;

import exercise.B13.Exception.BirthDayException;
import exercise.B13.Exception.EmailException;
import exercise.B13.Exception.FullNameException;
import exercise.B13.Exception.PhoneException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeManager {
    Scanner sc = new Scanner(System.in);
    private List<Employee> employeeList = new ArrayList<>();

    ExceptionCheck ec = new ExceptionCheck();

    public EmployeeManager() {
        employeeList = new ArrayList<>();
    }

    public static LocalDate dateInput(String userInput) {

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = null;
        try {
            date = LocalDate.parse(userInput, dateFormat);
        } catch (Exception e) {

        }
        return date ;
    }

    public void insert(Employee employee) {
        employeeList.add(employee);
    }

    public void insert(int type) {
        if (type == 0) {
            insertIntern();
            return;
        }
        if (type == 1) {
            insertFresher();
            return;
        }
        if (type == 2) {
            insertExperience();
            return;
        }
        return;
    }

    public void catchException(String name, String email, LocalDate birthday, String phone) {

    }

    public void insertIntern() {
        System.out.println("Enter ID:");
        String id = sc.nextLine();
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter birthday with format dd/MM/yyyy:");
        LocalDate birthday = dateInput(sc.nextLine());
        System.out.println("Enter phone number:");
        String phone = sc.nextLine();
        System.out.println("Enter email:");
        String email = sc.nextLine();
        System.out.println("Enter major:");
        String majors = sc.nextLine();
        System.out.println("Enter semester:");
        String semester = sc.nextLine();
        System.out.println("Enter university name:");
        String university_name = sc.nextLine();
        try {
            ec.nameCheck(name);
            ec.emailCheck(email);
            ec.birthdayCheck(birthday);
            ec.phoneCheck(phone);
        } catch (FullNameException e) {
            System.out.println("Invalid name");
            return;
        } catch (EmailException e) {
            System.out.println("Invalid email");
            return;
        } catch (BirthDayException e) {
            System.out.println("Invalid day");
            return;
        } catch (PhoneException e) {
            System.out.println("Invalid phone number");
            return;
        } catch (Exception e) {
            System.out.println("Unknown exception");
            return;
        }
        Intern intern = new Intern(id, name, birthday, phone, email, majors, semester, university_name);

        System.out.println("Enter number of certificates:");
        int num_certificate = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num_certificate; i++) {
            System.out.println("Certificate " + i + ":");
            System.out.println("Enter Certificate ID:");
            String CertificatedID = sc.nextLine();
            System.out.println("Enter Certificate name:");
            String CertificateName = sc.nextLine();
            System.out.println("Enter Certificate rank:");
            String CertificateRank = sc.nextLine();
            System.out.println("Enter Certificate date:");
            String CertificatedDate = sc.nextLine();
            Certificate certificate = new Certificate(CertificatedID, CertificateName, CertificateRank, CertificatedDate);
            intern.certificateList.add(certificate);
        }
        employeeList.add(intern);
        return;
    }

    public void insertFresher() {
        System.out.println("Enter ID:");
        String id = sc.nextLine();
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter birthday with format dd/MM/yyyy:");
        LocalDate birthday = dateInput(sc.nextLine());
        System.out.println("Enter phone number:");
        String phone = sc.nextLine();
        System.out.println("Enter email:");
        String email = sc.nextLine();
        System.out.println("Enter graduation date:");
        String graduation_date = sc.nextLine();
        System.out.println("Enter graduation rank:");
        String graduation_rank = sc.nextLine();
        System.out.println("Enter education:");
        String education = sc.nextLine();
        try {
            ec.nameCheck(name);
            ec.emailCheck(email);
            ec.birthdayCheck(birthday);
            ec.phoneCheck(phone);
        } catch (FullNameException e) {
            System.out.println("Invalid name");
            return;
        } catch (EmailException e) {
            System.out.println("Invalid email");
            return;
        } catch (BirthDayException e) {
            System.out.println("Invalid day");
            return;
        } catch (PhoneException e) {
            System.out.println("Invalid phone number");
            return;
        } catch (Exception e) {
            System.out.println("Unknown exception");
            return;
        }
        Fresher fresher = new Fresher(id, name, birthday, phone, email, graduation_date, graduation_rank, education);

        System.out.println("Enter number of certificates:");
        int num_certificate = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num_certificate; i++) {
            System.out.println("Certificate " + i + ":");
            System.out.println("Enter Certificate ID:");
            String CertificatedID = sc.nextLine();
            System.out.println("Enter Certificate name:");
            String CertificateName = sc.nextLine();
            System.out.println("Enter Certificate rank:");
            String CertificateRank = sc.nextLine();
            System.out.println("Enter Certificate date:");
            String CertificatedDate = sc.nextLine();
            Certificate certificate = new Certificate(CertificatedID, CertificateName, CertificateRank, CertificatedDate);
            fresher.certificateList.add(certificate);
        }
        employeeList.add(fresher);
        return;
    }

    public void insertExperience() {
        System.out.println("Enter ID:");
        String id = sc.nextLine();
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter birthday with format dd/MM/yyyy:");
        LocalDate birthday = dateInput(sc.nextLine());
        System.out.println("Enter phone number:");
        String phone = sc.nextLine();
        System.out.println("Enter email:");
        String email = sc.nextLine();
        System.out.println("Enter exp year:");
        int explnYear = sc.nextInt();
        System.out.println("Enter pro skill:");
        String proSkill = sc.nextLine();
        try {
            ec.nameCheck(name);
            ec.emailCheck(email);
            ec.birthdayCheck(birthday);
            ec.phoneCheck(phone);
        } catch (FullNameException e) {
            System.out.println("Invalid name");
            return;
        } catch (EmailException e) {
            System.out.println("Invalid email");
            return;
        } catch (BirthDayException e) {
            System.out.println("Invalid day");
            return;
        } catch (PhoneException e) {
            System.out.println("Invalid phone number");
            return;
        } catch (Exception e) {
            System.out.println("Unknown exception");
            return;
        }
        Experience experience = new Experience(id, name, birthday, phone, email, explnYear, proSkill);

        System.out.println("Enter number of certificates:");
        int num_certificate = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num_certificate; i++) {
            System.out.println("Certificate " + i + ":");
            System.out.println("Enter Certificate ID:");
            String CertificatedID = sc.nextLine();
            System.out.println("Enter Certificate name:");
            String CertificateName = sc.nextLine();
            System.out.println("Enter Certificate rank:");
            String CertificateRank = sc.nextLine();
            System.out.println("Enter Certificate date:");
            String CertificatedDate = sc.nextLine();
            Certificate certificate = new Certificate(CertificatedID, CertificateName, CertificateRank, CertificatedDate);
            experience.certificateList.add(certificate);
        }
        employeeList.add(experience);
        return;
    }

    public Employee findById(String id) {
        return this.employeeList.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
    }

    public void deleteById(String id) {
        Employee employee = findById(id);
        if (employee == null) {
            System.out.println("Invalid id");
            return;
        }
        employeeList.remove(employee);
        System.out.println("Delete finished");
        return;
    }

    public List<Employee> findByType(String type) {
        return this.employeeList.stream().filter(e -> {
            if (type.equals("2")) {
                return e instanceof Experience;
            }
            if (type.equals("1")) {
                return e instanceof Fresher;
            }
            if (type.equals("0")) {
                return e instanceof Intern;
            }
            return false;
        }).collect(Collectors.toList());
    }

    public List<Employee> findAll() {
        return this.employeeList;
    }
}
