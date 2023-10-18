import java.util.Scanner;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] nums){
        int maxProfit = 0;
        int minPriceSoFar = nums[0];

        for(int i=0; i<nums.length; i++){
            maxProfit = Math.max(maxProfit, nums[i] - minPriceSoFar);
            minPriceSoFar = Math.min(nums[i] , minPriceSoFar);
        }

        return maxProfit;
    }

    public static void main(String[] args) {}
}
