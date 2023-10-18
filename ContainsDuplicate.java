import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class ContainsDuplicate {
    public static boolean duplicates(int[] nums, int k){
        ArrayList<Integer> input = new ArrayList<>();

        for (int i=0; i<nums.length; i++){
            if(input.contains(nums[i])){
                int j = input.lastIndexOf(nums[i]);
                if (Math.abs(i-j) <= k){
                    return true;
                }else {
                    input.add(nums[i]);
                }
            }else {
                input.add(nums[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
