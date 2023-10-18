import java.util.Arrays;

public class RemoveElement {
    public static int removeInt(int[] nums, int val){
//      0,1,2,2,3,0,4,2,2
//        2,2
//      val : 2
        int j= nums.length-1;
        int i=0;
        while (i<j){
            if(nums[j] == val){
                j--;
            }
            else if(nums[i] == val){
                if(nums[j] == val){
                    continue;
                }else {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j--;
                }
            }
            if(nums[i] != val){
                i++;
            }

        }

        return i;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2,2};
        System.out.println(Arrays.toString(nums));
        System.out.println(removeInt(nums, 2));
        System.out.println(Arrays.toString(nums));
    }
}
