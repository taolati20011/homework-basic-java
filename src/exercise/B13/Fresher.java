package exercise.B13;

import java.time.LocalDate;

public class Fresher extends Employee {
    String graduation_date;
    String graduation_rank;
    String education;

    public Fresher(String id, String fullname, LocalDate birthday, String phone, String email, String graduation_date, String graduation_rank, String education) {
        super(id, fullname, birthday, phone, email);
        this.employee_type = "1";
        newCreated();
        this.graduation_date = graduation_date;
        this.graduation_rank = graduation_rank;
        this.education = education;
    }

    @Override
    public String showInfo() {
        return "Fresher{" +
                "graduation_date='" + graduation_date + '\'' +
                ", graduation_rank='" + graduation_rank + '\'' +
                ", education='" + education + '\'' +
                ", id='" + id + '\'' +
                ", fullname='" + fullname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", employee_type='" + employee_type + '\'' +
                ",certificate= " + certificateList.toString() + '\'' +
                '}';
    }
}
