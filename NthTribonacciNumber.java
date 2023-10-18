public class NthTribonacciNumber {
    public static int getNumber(int n){
        if (n==0){
            return 0;
        }
        if (n==1 || n==2){
            return 1;
        }
        return getNumber(n-1) + getNumber(n-2) + getNumber(n-3);
    }
    public static void main(String[] args) {
        System.out.println(getNumber(35));
    }
}
