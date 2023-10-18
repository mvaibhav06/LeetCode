import java.util.Arrays;

public class AddBinary {
    public static String addingBinaryNums(String num1, String num2){
        int len1 = num1.length();
        int len2 = num2.length();
        int diff = Math.abs(len1 - len2);
        String zeroes = "";
        for (int i=0; i<diff; i++){
            zeroes += "0";
        }
        if (len1 < len2){
            zeroes += num1;
            num1 = zeroes;
        }
        if (len2 < len1){
            zeroes += num2;
            num2 = zeroes;
        }
        String sum = "";
        for (int j=0; j<num1.length(); j++){
            sum += "0";
        }
        char[] out = sum.toCharArray();
        int total = 0;
        for (int i=num1.length()-1; i>=0; i--){
            if ((num1.charAt(i)=='0' && num2.charAt(i)=='1') || (num1.charAt(i)=='1' && num2.charAt(i)=='0')){
                if (total==1){
                    out[i] = '0';
                    total = 1;
                }else {
                    out[i] = '1';
                }
            } else if (num1.charAt(i)=='0' && num2.charAt(i)=='0') {
                if (total==1){
                    out[i] = '1';
                    total = 0;
                }
            } else if (num1.charAt(i)=='1' && num2.charAt(i)=='1') {
                if (total==1){
                    out[i] = '1';
                    total = 1;
                }else {
                    out[i] = '0';
                    total = 1;
                }
            }
        }
        sum = new String(out);
        if (total == 1){
            return "1" + sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(addingBinaryNums("1","111"));

    }
}
