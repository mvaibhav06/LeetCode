public class MissingNumber {
    public static int returnMissingNumber(int[] nums, int n){
        int total = 0;
        for (int i=0; i<nums.length; i++){
            total += nums[i];
        }
        int realTotal = (n * (n+1))/2;
        return realTotal - total;
    }
    public static void main(String[] args) {

    }
}
