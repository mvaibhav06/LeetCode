import java.util.ArrayList;
import java.util.Arrays;

public class FairCandySwap {
    public static int[] getCandySwap(int[] alice, int[] bob){
        int totalAliceCandies = 0;
        int totalBobCandies = 0;

        for (int i=0; i<alice.length; i++){
            totalAliceCandies += alice[i];
        }
        for (int j=0; j<bob.length; j++){
            totalBobCandies += bob[j];
        }
        int[] out = new int[2];
        for (int i=0; i<alice.length; i++){
            for (int j=0; j<bob.length; j++){
                int temp1 = totalAliceCandies - alice[i] + bob[j];
                int temp2 = totalBobCandies - bob[j] + alice[i];
                if (temp1 == temp2){
                    out[0] = alice[i];
                    out[1] = bob[j];
                }
            }
        }
        return out;
    }
    public static void main(String[] args) {
        int[] alice = {2};
        int[] bob = {1,3};
        System.out.println(Arrays.toString(getCandySwap(alice,bob)));
    }
}
