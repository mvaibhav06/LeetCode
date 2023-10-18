public class Sqrt {
    public static int getSqrt(int num){
        int out = 0;
        for(int i=0; i<=num/2; i++){
            if(i==0) {
                i = 46340;
            }
            if ((i*i) <= num){
                out = i;
                continue;
            }else {
                break;
            }
        }
        return out;
    }
    public static void main(String[] args) {
      System.out.println(getSqrt(2147483647));


    }
}
