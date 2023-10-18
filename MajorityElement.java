import java.util.*;

public class MajorityElement {

    public static int getMajority(int[] nums){
        HashMap<Integer,Integer> myNums = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            if(myNums.containsKey(nums[i])){
                myNums.put(nums[i], myNums.get(nums[i])+1);
            }
            else {
                myNums.put(nums[i], 1);
            }
        }
        Iterator iterator = myNums.entrySet().iterator();
        int highest = 0;

        while (iterator.hasNext()){
            Map.Entry mapElement = (Map.Entry)iterator.next();
            if ((int)mapElement.getValue() > highest){
                highest = (int) mapElement.getValue();
            }
        }

        iterator = myNums.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry mapElement = (Map.Entry)iterator.next();
            if ((int)mapElement.getValue()==highest){
                return (int)mapElement.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getMajority(new int[]{2,2,1,1,1,2,2}));
    }
}
