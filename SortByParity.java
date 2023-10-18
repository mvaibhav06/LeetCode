import java.util.Arrays;

public class SortByParity {
    public static int[] sortArray(int[] nums){
        int i=0;
        int j=nums.length-1;
        while (i>j){
            if (nums[i]%2 == 0){
                i++;
                continue;
            }
            if (nums[j]%2 != 0) {
                j--;
                continue;
            }
            if (nums[i]%2 != 0 && nums[j]%2 == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArray(nums)));
    }
}
