package IO;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderExample {
    public static void main(String args[]) throws Exception {
        FileReader fr = new FileReader("text.txt");
        BufferedReader br = new BufferedReader(fr);

        int i;
        //read(): reads a single character
        while ((i = br.read()) != -1) {
            System.out.print((char) i);
        }
        br.close();
        fr.close();
    }
}