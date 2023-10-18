import java.util.Arrays;

public class LargestNumberAtleastTwice {
    public static int isLargestAtleastTwice(int[] nums){
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i=0; i<nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
                index = i;
            }
        }
        for (int i=0; i<nums.length; i++){
            if (max >= (2*nums[i]) || index==i){
                continue;
            }
            if (max < (2*nums[i])){
                return -1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(isLargestAtleastTwice(nums));
    }
}
