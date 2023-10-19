public class VerifyingAnAlienDictionary {
    public static boolean isSorted(String[] words, String order){
        for (int i=0; i<words.length-1; i++){
            String first = words[i];
            String next = words[i+1];
            int j=0;
            for (j=0; j<first.length(); j++){
                char a = first.charAt(j);
                if (j<next.length()){
                    char b = next.charAt(j);
                    if (order.indexOf(a) < order.indexOf(b)){
                        break;
                    } else if (order.indexOf(a) == order.indexOf(b)) {
                        continue;
                    } else {
                        return false;
                    }
                }
            }
            if (j>next.length()) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String order = "abcdefghijklmnopqrstuvwxyz";
        String[] words = {"apple","app"};
        System.out.println(isSorted(words,order));
    }
}
