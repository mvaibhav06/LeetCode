import java.util.Arrays;

public class ReverseVowelsOfString {
    public static String reverseVowels(String s){
        char[] temp = s.toCharArray();
        int i = 0;
        int j = temp.length-1;
        while (i<j){
            char ch = temp[i];
            char c = temp[j];
            if (!(ch==97 || ch==101 || ch==105 || ch==111 || ch==117 || ch==65 || ch==69 || ch==73 || ch==79 || ch==85)){
                i++;
                continue;
            }
            if (!(c==97 || c==101 || c==105 || c==111 || c==117 || c==65 || c==69 || c==73 || c==79 || c==85)){
                j--;
                continue;
            }
            temp[i] = c;
            temp[j] = ch;
            i++;
            j--;
        }
        String newStr = new String(temp);
        return newStr;
    }
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
}
