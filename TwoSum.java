import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target){
        int[] ans = new int[2];

        ArrayList<Integer> temp = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            if(temp.contains(diff)){
                ans[0] = temp.indexOf(diff);
                ans[1] = i;
                break;
            }else {
                temp.add(nums[i]);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] input = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(input , 18)));
    }
}
