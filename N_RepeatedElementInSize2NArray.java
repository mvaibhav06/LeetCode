import java.util.Arrays;

public class N_RepeatedElementInSize2NArray {
    public static int getRepeatedElement(int[] nums){
        int n = nums.length/2;
        Arrays.sort(nums);
        int counter = 1;
        for (int i=0; i<nums.length-1; i++){
            if (nums[i] == nums[i+1]){
                counter++;
                if (counter==n) return nums[i];
            }else {
                counter = 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {5,1,5,2,5,3,5,4};
        System.out.println(getRepeatedElement(nums));
    }
}
