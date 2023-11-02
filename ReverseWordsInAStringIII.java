import java.util.Arrays;

public class ReverseWordsInAStringIII {
    public static String reverseWords(String words){
        String[] word = words.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i=0; i<word.length; i++){
            StringBuilder reverseWord = new StringBuilder(word[i]);
            reverseWord.reverse();
            reversed.append(reverseWord).append(" ");
        }
        return reversed.toString().trim();

    }
    public static void main(String[] args) {
        String word = "Let's take LeetCode contest";
        System.out.println(reverseWords(word));
    }
}
