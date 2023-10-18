import java.util.HashSet;

public class TeemoAttacking {
    public static int totalTimeAshePoisoned(int[] timeSeries, int duration){
        HashSet<Integer> totalSeconds = new HashSet<>();
        for (int i=0; i<timeSeries.length; i++){
            int start = timeSeries[i];
            int end  = start + duration -1;
            for (int j=start; j<=end; j++){
                totalSeconds.add(j);
            }
        }
        return totalSeconds.size();
    }
    public static void main(String[] args) {

    }
}
