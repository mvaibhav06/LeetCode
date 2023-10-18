import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PositionsOfLargeGroups {
    public static List<List<Integer>> getPositions(String s){
        List<List<Integer>> out = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int counter = 1;
        int i = 0;
        for (i=0; i<s.length()-1; i++){
            if (s.charAt(i) == s.charAt(i+1)){
                counter++;
            }else {
                if (counter >= 3){
                    temp.add(i-counter+1);
                    temp.add(i);
                    out.add(temp);
                    temp = new ArrayList<>();
                }
                counter = 1;
            }
        }
        if (counter >= 3){
            temp.add(i-counter+1);
            temp.add(i);
            out.add(temp);
        }
        return out;
    }

    public static void main(String[] args) {
        List<List<Integer>> out = getPositions("aaa");
        System.out.println(out);
    }
}
