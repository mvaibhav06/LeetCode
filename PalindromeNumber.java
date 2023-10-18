public class PalindromeNumber {
    public static boolean isPalindromeNumber(int n){
        String num = Integer.toString(n);
        int i = 0;
        int j = num.length()-1;
        if (num.length() < 2){
            return false;
        }
        while (i<j){
            if (num.charAt(i) == num.charAt(j)){
                i++;
                j--;
            }else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
