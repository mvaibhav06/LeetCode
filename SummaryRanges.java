public class SummaryRanges {
    public static void printRanges(int[] nums){
        System.out.print(nums[0]);
        for (int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]+1){
                System.out.print(" --> " + nums[i]);
            }else {
                System.out.println();
                System.out.print(nums[i]);
            }
        }
    }
    public static void main(String[] args) {
        printRanges(new int[]{0,2,3,4,6,8,9});
    }
}
