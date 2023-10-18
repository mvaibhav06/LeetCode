import java.util.Arrays;

public class SetMisMatch {
    public static int[] getMissingNumber(int[] nums){
        Arrays.sort(nums);
        int[] out = new int[2];
        int i = 0;
        for (i=0; i<nums.length-1; i++){
            if (nums[i] == nums[i+1]){
                out[0] = nums[i];
                nums[i] = 0;
                break;
            }
        }
        int sum = 0;
        for (int j=0; j<nums.length; j++){
            sum += nums[j];
        }
        out[1] = ((nums.length * (nums.length+1))/2) - sum;
        return out;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getMissingNumber(new int[]{1,5,3,2,2,7,6,4,8,9})));
    }
}
