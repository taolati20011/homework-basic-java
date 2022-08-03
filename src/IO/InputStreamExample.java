package IO;

import java.io.*;

@FunctionalInterface
interface Demo {
    static int n = 5;
    void doSth();
    default void defaultMethod() {}
    default void defaultMethod1() {}
}
class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String address;
    private int age;

    public void Student() {}

    public Student(int id, String name, String address, int age) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString() {
        return "Student@[id=" + id + " , name=" + name + ", "
                + "address= " + address + ",age =" + age+ "]";
    }
}

class InputStreamExample {
    public static void main(String args[]) throws Exception {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("file.txt"));
            Student student = new Student(1, "Dung", "HN", 100);
            oos.writeObject(student);
            oos.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oos.close();
        }
        System.out.println("success...");


        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("C:/Users/Dung Pham/IdeaProjects/testJava/file.txt"));
            Student student = (Student) ois.readObject();
            System.out.println(student);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }
    }
}