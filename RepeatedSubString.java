public class RepeatedSubString {
    public static boolean isRepeatedSubString(String s){
        String temp = "";
        for (int i=0; i<s.length(); i++){
            temp = s.substring(i+1,s.length()) + s.charAt(i);
//            a baab a
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isRepeatedSubString("abcabcabcabc"));
    }
}
