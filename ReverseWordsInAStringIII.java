import java.util.Arrays;

public class ReverseWordsInAStringIII {
    public static String reverseWords(String words){
        String[] word = words.split(" ");

        for (int i=0; i<word.length; i++){
            int m=0;
            int n = word[i].length()-1;
            char[] inp = word[i].toCharArray();
            while (m<n){
                char ch = inp[m];
                inp[m] = inp[n];
                inp[n] = ch;
                m++;
                n--;
            }
            word[i] = new String(inp);
        }
        String out = "";
        for (int p=0; p<word.length; p++){
            out += word[p];
            if(p!=word.length-1){
                out += " ";
            }
        }
        return out;
    }
    public static void main(String[] args) {
        String word = "Let's take LeetCode contest";
        System.out.println(reverseWords(word));
    }
}
