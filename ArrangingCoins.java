public class ArrangingCoins {
    public static int steps(int coins){
        int i = 0;
        while (coins >= 0){
            i++;
            if (i > coins){
                break;
            }
            coins = coins - i;
        }
        return i-1;
    }

    public static void main(String[] args) {
        System.out.println(steps(8));
    }
}
