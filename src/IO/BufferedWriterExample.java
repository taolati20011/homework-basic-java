import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class BufferedWriterExample {
    public static void main(String[] args) throws Exception {
        FileWriter buffer = new FileWriter("text.txt");
        //BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("This is a line of text inside the file");
        buffer.close();
        System.out.println("Success...");
    }
}