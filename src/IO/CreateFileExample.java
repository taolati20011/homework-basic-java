import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class CreateFileExample {
    public static void main(String args[]) {
        try {
            File myFile = new File("text.txt");
            //File myFile = new File("C:/Users/Dung Pham/IdeaProjects/testJava/text.txt");
            if (myFile.createNewFile()) {
                System.out.println(myFile.getName());  //output: text.txt
            }
            else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        File srcFile = new File("C:/Users/Dung Pham/IdeaProjects/testJava/src");
        System.out.println(Arrays.toString(srcFile.list()));
    }
}
