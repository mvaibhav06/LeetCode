import java.util.ArrayList;

public class SelfDividingNums {
    public static ArrayList<Integer> printSelfDividingNums(int left, int right){
        ArrayList<Integer> out = new ArrayList<>();
        for (int i=left; i<=right; i++){
            int n = i;
            while (n!=0){
                int a = n%10;
                if (a == 0){
                    break;
                }
                if (i%a == 0){
                    n = n/10;
                }else {
                    break;
                }
                if (n==0){
                    out.add(i);
                }
            }
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(printSelfDividingNums(47,85));
    }
}
