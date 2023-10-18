import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
    public static void printCommonCharacters(String[] words){
        String firstWord = words[0];
        List<String> out = new ArrayList<>();
        for (int i=0; i<firstWord.length(); i++){
            char ch = firstWord.charAt(i);
            int j;
            for (j=1; j<words.length; j++){
                String word = words[j];
                int index = word.indexOf(ch);
                if (index == -1){
                    break;
                }
                words[j] = word.replaceFirst(String.valueOf(ch),"");

            }
            if (j==words.length){
                out.add(String.valueOf(ch));
                //System.out.println(ch);
            }
        }

    }
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        printCommonCharacters(words);
    }
}
