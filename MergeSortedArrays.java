import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] a = {2, 4, 5, 6, 7, 8,   0, 0, 0, 0, 0};
        int[] b = {1, 2, 3, 4, 9};

        int m = 6;
        int n  = b.length;
        int i = m-1;
        int j = n-1;
        int k = a.length-1;

        while (j>=0){
            if(i>=0 && a[i] >= b[j]){
                a[k] = a[i];
                i--;
                k--;
            }else {
                a[k] = b[j];
                j--;
                k--;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
