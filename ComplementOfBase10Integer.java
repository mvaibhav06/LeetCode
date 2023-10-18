import java.util.ArrayList;
import java.util.List;

public class ComplementOfBase10Integer {
    public static int getComplement(int num){
        List<Integer> binary = new ArrayList<>();
        while (num>0){
            binary.add(num%2);
            num = num/2;
        }
        for (int i=0; i<binary.size(); i++){
            if (binary.get(i) == 0){
                binary.set(i,1);
            }else {
                binary.set(i,0);
            }
        }
        int out = 0;
        for (int j=0; j<binary.size(); j++){
            out += binary.get(j) * Math.pow(2,j);
        }
        return out;
    }
    public static void main(String[] args) {
        System.out.println(getComplement(5));
    }
}
