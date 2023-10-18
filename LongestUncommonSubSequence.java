public class LongestUncommonSubSequence {
    public static int longestSequence(String a, String b){
        if(a.equals(b)){
            return -1;
        }
        return Math.max(a.length(),b.length());

    }
    public static void main(String[] args) {
        System.out.println(longestSequence("aefawfawfawfaw","aefawfeawfwafwaef"));
    }
}
