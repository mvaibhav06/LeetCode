import java.util.Arrays;

public class LongestCommonPrefix {
    public static String printCommonPrefix(String[] input){

        Arrays.sort(input);
        String s1 = input[0];
        String s2 = input[input.length - 1];
        int idx = 0;

        while (idx<s1.length() && idx<s2.length()){
            if (s1.charAt(idx) == s2.charAt(idx)){
                idx++;
                continue;
            }
            else {
                break;
            }
        }
        return s1.substring(0,idx);
    }
}
