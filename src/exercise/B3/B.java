package exercise.B3;

public class B extends Student {
    public B() {
    }

    public B(String id, String name, String address, String level) {
        super(id, name, address, level);
        this.subjects.add("Toan");
        this.subjects.add("Hoa");
        this.subjects.add("Sinh");
    }

    @Override
    public String toString() {
        return "B{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", level='" + level + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
