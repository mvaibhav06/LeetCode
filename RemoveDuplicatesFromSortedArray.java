import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums){
        int j=1;
        for (int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){

            }else {
                int temp = nums[i];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2,3,3,3,3,3,4};
        System.out.println(Arrays.toString(nums));

        int temp = removeDuplicates(nums);
        System.out.println(temp);
        System.out.println(Arrays.toString(nums));
    }
}
