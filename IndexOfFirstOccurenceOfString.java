public class IndexOfFirstOccurenceOfString {
    public static int getFirstOccurence(String haystack, String needle){
        if (haystack.contains(needle)){
            System.out.println(haystack.indexOf(needle));

        }
        return haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        getFirstOccurence("sadbutsad","sad");
    }
}
