public class GreatestCommonDivisorInStrings {
    public static void getGCDString(String word1, String word2){
        String charSequence = "";
        String out = "";
        boolean isPrevTrue = false;
        for (int i=0; i<word2.length(); i++){
            charSequence = String.valueOf(word2.charAt(i));
            if (word1.contains(charSequence)){
                if (isPrevTrue){
                    out += charSequence;
                }else {
                    out += charSequence;
                    isPrevTrue = true;
                }
            }
        }
        System.out.println(out);
    }
    public static void main(String[] args) {
        getGCDString("LEET","CODE");
    }
}
