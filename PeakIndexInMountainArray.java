public class PeakIndexInMountainArray {
    public static int getIndexOfMountainArray(int[] nums){
        boolean foundBigElement = false;
        int sol = -1;
        for (int i=1; i<nums.length; i++){
            if (!foundBigElement){
                if (nums[i] > nums[i-1]){
                    continue;
                }else {
                    if (foundBigElement){
                        break;
                    }else {
                        foundBigElement = true;
                        sol = i-1;
                    }
                }
            }else {
                if (nums[i] < nums[i-1]){
                    continue;
                }else {
                    break;
                }
            }
        }
        return sol;
    }
    public static void main(String[] args) {
        System.out.println(getIndexOfMountainArray(new int[]{0,10,5,2}));
    }
}
