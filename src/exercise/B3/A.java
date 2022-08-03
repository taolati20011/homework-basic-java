package exercise.B3;

import java.util.ArrayList;
import java.util.List;

public class A extends Student {
    public A() {
    }

    public A(String id, String name, String address, String level) {
        super(id, name, address, level);
        this.subjects.add("Toan");
        this.subjects.add("Ly");
        this.subjects.add("Hoa");
    }

    @Override
    public String toString() {
        return "A{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", level='" + level + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
