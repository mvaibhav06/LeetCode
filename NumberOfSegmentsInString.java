public class NumberOfSegmentsInString {
    public static int getNumberOfSegments(String s){
        if (s.equals("")) return 0;
        String[] inp = s.split(" ");
        int counter = 0;
        for (int i=0; i<inp.length; i++){
            if (!inp[i].equals("")) counter++;
        }
        return counter;
    }
    public static void main(String[] args) {

    }
}
