public class AddDigits {
    public static int addingDigits(int n){
        int sum = 0;
        while (n>0){
            sum += n%10;
            n = n/10;
        }
        if (sum<10){
            return sum;
        }else {
            return addingDigits(sum);
        }
    }
    public static void main(String[] args) {
        System.out.println(addingDigits(0));
    }
}
