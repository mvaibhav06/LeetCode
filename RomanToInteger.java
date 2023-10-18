public class RomanToInteger {
    public static int printNumber(String roman){
        String a = "";
        int num = 0;
        int i = 0;
        while ( i<roman.length()-1){
            a += String.valueOf(roman.charAt(i)) + String.valueOf(roman.charAt(i+1));
            if (a.equals("IV")){
                num += 4;
                i += 2;
                a = "";
                continue;
            }
            if (a.equals("IX")){
                num += 9;
                i += 2;
                a = "";
                continue;
            }
            if (a.equals("XL")){
                num += 40;
                i += 2;
                a = "";
                continue;
            }
            if (a.equals("XC")){
                num += 90;
                i += 2;
                a = "";
                continue;
            }
            if (a.equals("CD")){
                num += 400;
                i += 2;
                a = "";
                continue;
            }
            if (a.equals("CM")){
                num += 900;
                i += 2;
                a = "";
                continue;
            }
            a = "";
            if (roman.charAt(i) == 'M'){
                num += 1000;
            } else if (roman.charAt(i) == 'D') {
                num += 500;
            }else if (roman.charAt(i) == 'C'){
                num += 100;
            } else if (roman.charAt(i) == 'L') {
                num += 50;
            }else if (roman.charAt(i) == 'X'){
                num += 10;
            } else if (roman.charAt(i) == 'V') {
                num += 5;
            } else if (roman.charAt(i) == 'I') {
                num += 1;
            }
            i++;
        }
        if (i == roman.length()-1){
            if (roman.charAt(i) == 'M'){
                num += 1000;
            } else if (roman.charAt(i) == 'D') {
                num += 500;
            }else if (roman.charAt(i) == 'C'){
                num += 100;
            } else if (roman.charAt(i) == 'L') {
                num += 50;
            }else if (roman.charAt(i) == 'X'){
                num += 10;
            } else if (roman.charAt(i) == 'V') {
                num += 5;
            } else if (roman.charAt(i) == 'I') {
                num += 1;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        printNumber("MCMXCIV");

    }
}
