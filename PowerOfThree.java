public class PowerOfThree {
    public static boolean isPowerOfThree(int n){
        int i = 0;
        int num = 0;
        while (num <= n){
            num = (int) Math.pow(3,i);
            if (n == num){
                return true;
            }
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(-1));
    }
}
