package exercise.B3;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<Student> studentList;

    public StudentManager() {
        this.studentList = new ArrayList<Student>();
    }

    public void add(Student student) {
        this.studentList.add(student);
    }

    public void showStudentList() {
        this.studentList.forEach(student -> System.out.println(student.toString()));
    }

    public void searchByID(String id) {
        Student student1 = this.studentList.stream().filter(student -> student.getId().equals(id)).
                findFirst().orElse(null);
        if (student1 == null) {
            System.out.println("No student found");
            return;
        }
        System.out.println(student1.toString());
        return;
    }
}
