import java.util.HashMap;
import java.util.LinkedHashMap;

public class firstUniqueCharacter {
    public static int getfirstUnique(String s){
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (s.indexOf(ch) == s.lastIndexOf(ch)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(getfirstUnique("leetcode"));
    }
}
