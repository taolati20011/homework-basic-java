package exercise.B13;

import java.time.LocalDate;

public class Intern extends Employee {
    String majors;
    String semester;
    String university_name;

    public Intern(String id, String fullname, LocalDate birthday, String phone, String email, String majors, String semester, String university_name) {
        super(id, fullname, birthday, phone, email);
        this.employee_type = "2";
        newCreated();
        this.majors = majors;
        this.semester = semester;
        this.university_name = university_name;
    }

    @Override
    public String showInfo  () {
        return "Intern{" +
                "majors='" + majors + '\'' +
                ", semester='" + semester + '\'' +
                ", university_name='" + university_name + '\'' +
                ", id='" + id + '\'' +
                ", fullname='" + fullname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", employee_type='" + employee_type + '\'' +
                '}';
    }
}
