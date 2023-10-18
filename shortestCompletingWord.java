import java.util.ArrayList;

public class shortestCompletingWord {
    public static String getShortestCompletingWord(String licensePlate, String[] words){
        String trimmedLicensePlate = "";
        ArrayList<String> solution = new ArrayList<>();
        for (int i=0; i<licensePlate.length(); i++){
            if (Character.isAlphabetic(licensePlate.charAt(i))){
                trimmedLicensePlate += Character.toLowerCase(licensePlate.charAt(i));
            }
        }
//        System.out.println(trimmedLicensePlate);
        for (int i=0; i<words.length; i++){
            String word = words[i];
            int j = 0;
            for (j=0; j<trimmedLicensePlate.length(); j++){
                if (word.contains(String.valueOf(trimmedLicensePlate.charAt(j)))){
                    word = word.replaceFirst(String.valueOf(trimmedLicensePlate.charAt(j)), "");
                }else {
                    break;
                }
            }
            if (j == trimmedLicensePlate.length()){
                solution.add(words[i]);
            }
        }
        int min = Integer.MAX_VALUE;
        for (int k=0; k<solution.size(); k++){
            if (solution.get(k).length() < min){
                min = solution.get(k).length();
            }
        }
//        System.out.println(solution);
        for (int k=0; k<solution.size(); k++){
            if (min==solution.get(k).length()){
                return solution.get(k);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String[] words = {"looks","pest","stew","show"};
        System.out.println(getShortestCompletingWord("1s3 456",words));
    }
}
