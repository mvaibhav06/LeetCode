import java.util.Arrays;

public class ThirdMaximumNumber {
    public static int getThirdLargest(int[] nums){
        Arrays.sort(nums);
        if (nums.length <= 2){
            return nums[-1];
        }
        int max = nums[nums.length-1];
        int count = 1;
        for (int i=nums.length-2; i>=0; i--){
            if (count==3){
                break;
            }
            if(nums[i] < max){
                count++;
                max = nums[i];
            }
        }
        if (count==2){
            return nums[-1];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,3,1};
        System.out.println(getThirdLargest(nums));
    }
}
