public class ValidPalindromeII {
    public static boolean isPalindrome(String s){
        StringBuilder inp = new StringBuilder(s);
        String reversed = inp.reverse().toString();
        if (s.equals(reversed)) return true;

        for (int i=0; i<s.length(); i++){
            int len = s.length();
            String temp = s.substring(0,i) + s.substring(i+1,len);
            StringBuilder reverse = new StringBuilder(temp);
            String str = reverse.reverse().toString();
            if (temp.equals(str)) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("abc"));
    }
}
