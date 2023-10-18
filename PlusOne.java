import java.util.Arrays;

public class PlusOne {
    public static void addOne(int[] nums){
        for (int i=nums.length-1; i>=0; i--){
            if(nums[i] < 9){
                nums[i]++;
                System.out.println(Arrays.toString(nums));
                return;
            }
            nums[i] = 0;
        }
        nums = new int[nums.length+1];
        nums[0] = 1;
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        addOne(new int[]{9,8,7,6,5,4,3,2,1,0});
    }
}
