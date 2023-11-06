public class LongestPalindromicSubstring {
    public static boolean isPalindrome(String s){
        /*int i=0;
        int j = s.length()-1;
        while (i < j){
            if (s.charAt(i) == s.charAt(j)){
                continue;
            }else {
                return false;
            }
        }
        return true;*/
        StringBuilder temp = new StringBuilder(s);
        StringBuilder str = temp.reverse();
        if (temp == str) return true;
        return false;
    }
    public static String getLongestPalindromicSubstring(String s){
        String out = "";
        int i=0;
        int j=0;
        while (i < s.length()){
            String substr = s.substring(i,j+1);
            if (isPalindrome(substr)){
                if (substr.length() > out.length()){
                    out = substr;
                }
            }
            j++;
            if (j==s.length()){
                i++;
                j = i+out.length();
            }
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(getLongestPalindromicSubstring(""));
        System.out.println(isPalindrome("baba"));
    }
}
