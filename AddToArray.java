import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddToArray {
    public static List<Integer> addIntegerToArray(int[] nums, int k){
        int carry = 0;
        List<Integer> out = new ArrayList<>();
        for (int i=nums.length-1; i>=0; i--){
            nums[i] += carry + k;
            carry = 0;
            if (nums[i] > 9){
                carry = nums[i]/10;
                nums[i] = nums[i]%10;
            }
        }
        return out;
    }

    public static void main(String[] args) {
        int[] inp = {9,9,9,9,9,9,9,9,9,9};
        System.out.println(addIntegerToArray(inp,1));
    }
}
