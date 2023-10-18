public class findPivotIndex {
    public static int pivotIndex(int[] nums){
        int sum = 0;
        int startingSum = 0;
        int i = 0;
        for (i=0; i<nums.length-1; i++){
            for (int j=i+1; j<nums.length; j++) {
                sum += nums[j];
            }
            if (i==0){
                if (sum==0) {
                    return 0;
                }
            }
            else {
                if (startingSum == sum){
                    return i;
                }
            }
            sum = 0;
            startingSum += nums[i];
        }
        if(i == nums.length-1){
            if (startingSum==0) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {-1,-1,0,1,1,0};
        System.out.println(pivotIndex(nums));
    }
}
