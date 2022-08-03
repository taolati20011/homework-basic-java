package exercise.B10;

import java.util.Arrays;

public class Document {
    private String string;

    public Document() {
    }

    public Document(String string) {
        this.string = string;
    }

    public void countWords() {
        String s = this.string.replaceAll("^\\s+", "");
        System.out.println("Total word is: " + s.split("\\s+").length);;
    }

    public void countWordA() {
        System.out.println("Number of word a/ A is: " + this.string.chars().filter(a -> a == 'a' | a == 'A').count());
    }

    public void modifier() {
        String newString = this.string.replaceAll("\\s+", " ")
                .replaceAll("^\\s+|\\s+$", "");
        this.string = newString;
        System.out.println(this.string);
    }
}
