package exercise.B13;

import java.time.LocalDate;

public class Experience extends Employee {
    int explnYear;
    String proSkill;

    public Experience(String id, String fullname, LocalDate birthday, String phone, String email, int explnYear, String proSkill) {
        super(id, fullname, birthday, phone, email);
        this.employee_type = "0";
        newCreated();
        this.explnYear = explnYear;
        this.proSkill = proSkill;
    }

    @Override
    public String showInfo() {
        return "Experience{" +
                "explnYear=" + explnYear +
                ", proSkill='" + proSkill + '\'' +
                ", id='" + id + '\'' +
                ", fullname='" + fullname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", employee_type='" + employee_type + '\'' +
                '}';
    }
}
