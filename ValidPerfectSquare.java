public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num){
        int i = 1;
        while (i <= num){
            if (i*i==num){
                return true;
            }

            i++;

        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(14));
    }
}
