public class ValidPalindrome {
    public static boolean isValidPalindrome(String s){
        s = s.toLowerCase();
        int i = 0;
        int j = s.length()-1;

        while (i<=j){
            char first = s.charAt(i);
            char last = s.charAt(j);
            if (!Character.isLetterOrDigit(first)){
                i++;
            } else if (!Character.isLetterOrDigit(last)) {
                j--;
            }else {
                if (first == last){
                    continue;
                }else {
                    return false;
                }
            }
            return true;
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(isValidPalindrome("A man, a plan, a canal: Panama"));
    }
}
