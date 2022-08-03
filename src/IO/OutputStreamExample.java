import java.io.*;

public class OutputStreamExample {
    public static void main(String args[]) {
        try {

            InputStream input = new FileInputStream("text.txt");
            //This is a line of text inside the file

            byte[] array = new byte[input.available()];
            input.read(array);

            String s = "ABCS";

            byte[] array1 = s.getBytes();

            FileOutputStream output = new FileOutputStream("output.txt");
            //DataOutputStream os = new DataOutputStream(output);

            output.write(array1);

            output.flush();

            output.close();

            /*
            OutputStream os = new FileOutputStream("output.txt");
            byte b[] = {65, 66, 67, 68, 69, 70};

            //illustrating write(byte[] b) method
            os.write(b);

            //illustrating flush() method
            os.flush(); //output in file output.txt: ABCDEF
            os.close();
             */
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
