public class SearchInsertPosition {

    public static int searchPos(int[] nums, int target){
        int i;
        for(i=0; i<nums.length; i++){
            if(nums[i] < target){
                continue;
            }else {
                return i;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(searchPos(nums,target));
    }
}
