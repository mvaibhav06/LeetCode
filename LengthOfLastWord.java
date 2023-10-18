import java.util.Arrays;

public class LengthOfLastWord {
    public static int lastWordLength(String s){
        String[] inp = s.split(" ");
        return inp[inp.length-1].length();
    }
    public static void main(String[] args) {
        lastWordLength("Hello world theyre you are");
    }
}
