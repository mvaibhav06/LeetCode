import java.util.HashSet;

public class UniqueMorseCodeWords {
    public static int getUniqueWords(String[] words){
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> morseCode = new HashSet<>();
        String word = "";

        for (int i=0; i<words.length; i++){
            char[] ch = words[i].toCharArray();
            for (int j=0; j<ch.length; j++){
                int current = (int) ch[j];
                current -= 97;
                word += codes[current];
            }
            morseCode.add(word);
            word = "";
        }
        return morseCode.size();
    }
    public static void main(String[] args) {
        String[] words = {"a"};
        System.out.println(getUniqueWords(words));
    }
}
