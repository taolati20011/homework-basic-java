package exercise.B15;

public class Student1 extends Student {
    String location;

    public Student1(String location) {
        this.location = location;
    }

    public Student1(String id, String name, String dob, String year, String grade, String location) {
        super(id, name, dob, year, grade);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
