import java.util.Arrays;
import java.util.HashMap;

public class SumTwo {
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> temp = new HashMap<>();
        for (int i=0; i<nums.length; i++){

            int rem = target - nums[i];

            if (temp.containsKey(nums[i])){
                return new int[]{temp.get(nums[i]),i};
            }else {
                temp.put(rem,i);
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums,9)));
    }
}
