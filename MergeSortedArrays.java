import java.util.Arrays;

public class MergeSortedArrays {
    public static void mergingSortedArrays(int[] num1, int[] num2, int m, int n){
        int i = m-1;
        int j = n-1;
        int p = num1.length-1;

        while (j>=0){
            if (i>=0 && num1[i] > num2[j]){
                num1[p] = num1[i];
                i--;
                p--;
            }else {
                num1[p] = num2[j];
                j--;
                p--;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {0};
        int[] b = {1};
        mergingSortedArrays(a,b,0,1);
        System.out.println(Arrays.toString(a));

    }
}
