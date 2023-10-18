public class ReverseStringII {
    public static String reverseString(String s, int k){

//        i = 0-k     2k+1-3k   4k+1-5k    (2n)*k+1 -(2n+1)k       8 2   0-1  4-5
//            k+1-2k   3k+1-4k  5k+1-6k     (2n+1)k+1 - (2n)k            2-3  6-7  k=2

        char[] str = s.toCharArray();
        int n=0;
        int num = str.length/(2*k);
        while (n<num){
            int i = (2*n)*k;
            int j = ((2*n)*k) + k-1;
            while (i < j){
                char ch = str[i];
                str[i] = str[j];
                str[j] = ch;
                i++;
                j--;
            }
            n++;
        }
        int p = str.length%(2*k);
        int q = num*2*k;
        int rem = str.length-q;

        if (rem < k){
            int l = num*2*k;
            int m = str.length-1;
            while (l<m){
                char c = str[l];
                str[l] = str[m];
                str[m] = c;
                l++;
                m--;
            }
        }else {
            int start = num*2*k;
            int end = start+k-1;
            while (start<end){
                char c = str[start];
                str[start] = str[end];
                str[end] = c;
                start++;
                end--;
            }
        }
        return new String(str);

    }

    public static void main(String[] args) {

        System.out.println(reverseString("abcd",2));
    }
}
