public class UglyNumber {
    public static boolean isUglyNumber(int num){
        while (num>1){
            if (num%2==0 || num%3==0 || num%5==0){
                if (num%2==0){
                    num = num/2;
                }
                if (num%3==0){
                    num = num/3;
                }
                if (num%5==0){
                    num = num/5;
                }
            }else {
                break;
            }
        }
        if (num==1){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isUglyNumber(14));
    }
}
