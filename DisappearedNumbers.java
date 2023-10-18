import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNumbers {
    public static List<Integer> printDisappearedNums(int[] nums){
        List<Integer> myList = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        for (int i=0; i<nums.length; i++){
            if (!myList.contains(nums[i])){
                myList.add(nums[i]);
            }
        }
        for (int i=0; i<nums.length; i++){
            if (!myList.contains(i)){
                output.add(i);
            }
        }
        return output;
    }
    public static void main(String[] args) {
        printDisappearedNums(new int[]{4,3,2,7,8,2,3,1});
    }
}
