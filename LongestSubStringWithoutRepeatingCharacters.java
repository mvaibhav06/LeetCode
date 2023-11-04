import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LongestSubStringWithoutRepeatingCharacters {
    public static int getLongestSubString(String s){
        int max = 0;
        int counter = 0;
        for (int i=0; i<s.length()-1; i++){
            String temp = "";
            temp += s.charAt(i);
            counter = 1;
            for (int j=i+1; j<s.length(); j++){
                String str = String.valueOf(s.charAt(j));
                if (!temp.contains(str)){
                    temp += str;
                    counter++;
                }else {
                    if (max < counter){
                        max = counter;
                    }
                    counter = 1;
                    break;
                }
            }
            if (counter > max) max = counter;
        }
        if (s.length() == 1) return 1;
        return max;
    }

    public static int getOptimalLongestSubString(String s){
        int counter = 0;
        int max = 0;
        int i=0;
        int j=0;
        String temp = "";
        for (j=0; j<s.length(); j++){
            String str = String.valueOf(s.charAt(j));
            if (!temp.contains(str)){
                temp += str;
                counter++;
            }else {
                break;
            }
        }
        while (i<s.length() && j<s.length()){
            if (temp.contains(String.valueOf(s.charAt(j)))){
                i++;
                temp = temp.substring(1);
            }
            else {
                temp += s.charAt(j);
                j++;
            }
            if (temp.length() > counter){
                counter = temp.length();
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(getOptimalLongestSubString(" "));
    }
}
