import java.util.ArrayList;

public class HappyNumber {
    public static boolean isHappyNumber(int num){
        ArrayList<Integer> cycle = new ArrayList<>();
        while (num>0){
            if (cycle.contains(num)){
                return false;
            }
            cycle.add(num);
            int total = 0;

            while (num>0){
                total += (num%10)*(num%10);
                num = num/10;
            }
            if (total==1){
                return true;
            }
            num = total;
        }

        return false;
    }
    public static void main(String[] args) {

    }
}
