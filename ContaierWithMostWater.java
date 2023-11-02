public class ContaierWithMostWater {
    public static int getMaxContainer(int[] height){
        int i=0;
        int j = height.length-1;
        int maxContainer = 0;
        while (i<j){
            int currentArea = Math.min(height[i],height[j])*(j-i);
            if (currentArea > maxContainer){
                maxContainer = currentArea;
            }
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxContainer;
    }
    public static void main(String[] args) {
        int[] nums = {1,1};
                //{1,8,6,2,5,4,8,3,7};
        System.out.println(getMaxContainer(nums));
    }
}
