import java.util.Arrays;

public class MaxProductOfThreeNums {
    public static int getMaxProduct(int[] nums){
        Arrays.sort(nums);
        int len = nums.length;
        int case1 = nums[0] * nums[1] * nums[len-1];
        int case2 = nums[len-1] * nums[len-2] * nums[len-3];
        int max = Integer.max(case1,case2);
        return max;
    }
    public static void main(String[] args) {

    }
}
