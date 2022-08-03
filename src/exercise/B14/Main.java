package exercise.B14;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();

        List<GoodStudent> goodStudent = Arrays.asList(
                new GoodStudent("Nguyễn Văn D","", "", "1", "",1 ,  7.3f, ""),
                new GoodStudent("Nguyễn Văn B","", "", "2", "",1 , 7.2f, ""),
                new GoodStudent("Nguyễn Văn A", "", "", "3", "", 1, 7.2f, ""),
                new GoodStudent("Nguyễn Văn C","", "", "4", "", 1,  7.3f, "")
        );
        System.out.println("abc");
        List<GoodStudent> lgs = sm.getSortedGoodStudent(goodStudent).subList(0, 2);
        lgs.forEach(o -> System.out.println(o.ShowMyInfor()));

        sm.showAll(goodStudent);
    }
}
