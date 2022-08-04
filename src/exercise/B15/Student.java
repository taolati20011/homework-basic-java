package exercise.B15;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String id;
    String name;
    String dob;
    String year;
    String grade;

    List<Result> res = new ArrayList<>();

    public Student() {
    }
    public Student(String id, String name, String dob, String year, String grade) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.year = year;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public List<Result> getRes() {
        return res;
    }

    public void setRes(List<Result> res) {
        this.res = res;
    }
}
