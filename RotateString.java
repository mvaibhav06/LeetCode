public class RotateString {
    public static boolean rotateString(String s1, String s2){
        String temp = s1+s1;
        if (s1.contains(s2)) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(rotateString("abcde","cdeab"));

    }
}
