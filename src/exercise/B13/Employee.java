package exercise.B13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    String id;
    String fullname;
    LocalDate birthday;
    String phone;
    String email;
    String employee_type;
    static int employee_count = 0;

    List<Certificate> certificateList;

    public Employee(String id, String fullname, LocalDate birthday, String phone, String email) {
        this.id = id;
        this.fullname = fullname;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        certificateList = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void newCreated() {
        employee_count++;
    }

    public String getEmployee_type() {
        return employee_type;
    }

    public void setEmployee_type(String employee_type) {
        this.employee_type = employee_type;
    }

    public String showInfo() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", fullname='" + fullname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", employee_type='" + employee_type + '\'' +
                ", employee_count='" + employee_count + '\'' +
                '}';
    }
}
