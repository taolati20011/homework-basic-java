package exercise.B3;

public class C extends Student {
    public C() {
    }

    public C(String id, String name, String address, String level) {
        super(id, name, address, level);
        this.subjects.add("Van");
        this.subjects.add("Su");
        this.subjects.add("Dia");
    }

    @Override
    public String toString() {
        return "C{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", level='" + level + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
