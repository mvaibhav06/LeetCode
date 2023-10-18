import java.util.Arrays;
import java.util.HashMap;

public class RansomNote {
    public static boolean canCreate(String ransomNote,String magazine){

        HashMap<Character, Integer> dictionary = new HashMap<>();

        for (int i=0; i<magazine.length(); i++){
            char c = magazine.charAt(i);
            if (!dictionary.containsKey(c)){
                dictionary.put(c,1);
            }else {
                dictionary.put(c, dictionary.get(c)+1);
            }
        }
        for (int j=0; j<ransomNote.length(); j++){
            char ch = ransomNote.charAt(j);
            if (dictionary.containsKey(ch)){
                dictionary.put(ch, dictionary.get(ch)-1);
            }else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(canCreate("bg","efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
    }
}
