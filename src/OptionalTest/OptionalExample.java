package OptionalTest;

import java.util.Optional;
import java.util.function.Consumer;

class Student {
    String name;
}

class OptionalExample1 {
    public void test() {
        Student student = getStudent("A");
        //Optional<Student> opt = Optional.empty();
        //Optional<Student> opt = Optional.of(student); //output: NullPointerException
        Optional<Student> opt = Optional.ofNullable(student); //output: A

        //System.out.println(opt.get().name);

        if (opt.isPresent()) {
            System.out.println(opt.get().name);
        }

        opt.ifPresent(student1 -> {student.name = "B";});

        if (opt.isPresent()) {
            System.out.println(opt.get().name);
        }
        /*
        opt = Optional.ofNullable(getStudent(""));
        System.out.println(opt);
        opt.orElse(getStudent("C"));

        if (opt.isPresent()) {
            System.out.println(opt.get().name);
        }

         */
    }

    private Student getStudent(String s) {
        Student student = new Student();
        student.name = s;
        return student;
    }
}

public class OptionalExample {
    public static void main(String args[]) {
        OptionalExample1 opte1 = new OptionalExample1();
        opte1.test();
    }
}
