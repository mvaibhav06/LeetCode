public class DetectCapital {
    public static boolean isValidCapitals(String s){
        if(s.length() < 2) return true;
        int i = 0;
        for (i=0; i<s.length(); i++){
            if (s.charAt(i)>=97 && s.charAt(i)<=122){
                continue;
            }else {
                break;
            }
        }
        if (i==s.length()) return true;

        if (!(s.charAt(0)>=65 && s.charAt(0)<=90)) return false;
        int j = 0;

        for (j=1; j<s.length(); j++){
            if (s.charAt(j)>=97 && s.charAt(j)<=122){
                continue;
            }else {
                break;
            }
        }
        if (j==s.length()) return true;

        int k = 0;
        for (k=1; k<s.length(); k++){
            if (s.charAt(k)>=65 && s.charAt(k)<=90){
                continue;
            }else {
                break;
            }
        }
        if (k==s.length()) return true;

        return false;
    }
    public static void main(String[] args) {
        System.out.println(isValidCapitals("USA"));
    }
}
