public class LongestContinousIncreasingSubSequence {
    public static int getContinousIncreasingSubSequence(int[] nums){
        int continous = 1;
        int longest = 0;
        for (int i=1; i<nums.length; i++){
            if (nums[i] > nums[i-1]){
                continous++;
            }else {
                if (continous > longest){
                    longest = continous;
                }
                continous = 1;
            }
        }
        if(continous > longest){
            longest = continous;
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,7};
        System.out.println(getContinousIncreasingSubSequence(nums));
    }
}
