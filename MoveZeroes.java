import java.util.Arrays;

public class MoveZeroes {
    public static int[] modifyArray(int[] nums){

        if (nums.length == 1){
            return nums;
        }

        if (nums.length > 1){
            int i = 0;
            int j = 1;
            while (j < nums.length){
                if(i==j){
                    j++;
                    continue;
                }
                if (nums[j] == 0){
                    j++;
                    continue;
                }
                if (nums[i] != 0){
                    i++;
                    continue;
                }
                if (nums[i] == 0){
                    nums[i] = nums[j];
                    nums[j] = 0;
                    i++;
                    j++;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {2,1};
        modifyArray(nums);
        System.out.println(Arrays.toString(nums));
    }
}
