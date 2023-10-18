import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivisibleBy5 {
    public static List<Boolean> isDivisible(int[] nums){
        int sum = 0;
        List<Boolean> out = new ArrayList<>();
        for (int i=0; i<nums.length; i++){
            sum = ((sum*2) + nums[i])%5;
            if (sum == 0){
                out.add(true);
            }else {
                out.add(false);
            }
        }
        return out;
    }
    public static void main(String[] args) {
        int[] inp = {1,1,0,0,0,1,0,0,1};
        System.out.println(isDivisible(inp));
    }
}
