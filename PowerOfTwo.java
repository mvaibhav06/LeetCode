public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n){
        int i=0;
        int num = Integer.MIN_VALUE;
        while (num <= n){
            num = (int) Math.pow(2,i);
            if (n == num){
                return true;
            }
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
//        System.out.println(isPowerOfTwo(4));
        double a =  Math.pow(2,110);
        System.out.println(a);
//        2147483647
    }
}
