public class MaxConsecutiveOnes {
    public static int getMaxConsecutiveOnes(int[] nums){
        int counter = 0;
        int max = 0;
//        1,1,0,1,1,1
        for (int i=0; i<nums.length; i++){
            if (nums[i]==1){
                counter++;
            }else {
                if (counter > max){
                    max = counter;
                }
                counter = 0;
            }
        }
        if (counter > max){
            max = counter;
        }
        return max;
    }
    public static void main(String[] args) {

    }
}
