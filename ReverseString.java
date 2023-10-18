import java.util.Arrays;

public class ReverseString {
    public static char[] reverse(char[] str){
        int i = 0;
        int j = str.length-1;
        while (i<j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        return str;
    }
    public static void main(String[] args) {
        char[] a = {'h','e','l','l','o'};
        System.out.println(Arrays.toString(reverse(a)));
    }
}
