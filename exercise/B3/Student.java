package exercise.B3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String id;
    String name;
    String address;
    String level;

    List<String> subjects;
    public Student() {}

    public Student(String id, String name, String address, String level) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.level = level;
        this.subjects = new ArrayList<>();
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
