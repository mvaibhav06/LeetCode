public class canPlaceFlowers {
    public static boolean placeFlowers(int[] input, int n){
        int flowers = 0;
        if (input[0]==0 && input[1]==0){
            input[0] = 1;
            flowers++;
        }
        for (int i=1; i<input.length-1; i++){
            if (input[i-1]==0 && input[i]==0 && input[i+1]==0){
                input[i] = 1;
                flowers++;
                if (flowers==n){
                    return true;
                }
            }
        }
        if (input[input.length-1]==0 && input[input.length-2]==0){
            input[input.length-1]=1;
            flowers++;
        }
        if (flowers >= n){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {

    }
}
