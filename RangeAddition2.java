public class RangeAddition2 {
    public static int getRangeAddition(int m, int n, int[][] ops){
        if (ops.length == 0){
            return m*n;
        }

        int[][] a = new int[m][n];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                a[i][j] = 0;
            }
        }


        for (int i=0; i<ops.length; i++){
            int[] inp = ops[i];
            for (int j=0; j<inp[0]; j++){
                for (int k=0; k<inp[1]; k++){
                    a[j][k]++;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        int times = 0;
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                if (a[i][j] > max){
                    times = 1;
                    max = a[i][j];
                }else {
                    if (max == a[i][j]){
                        times++;
                    }
                }
            }
        }
        return times;
    }
    public static void main(String[] args) {
        int[][] a = {};
        System.out.println(getRangeAddition(3,3,a));
    }
}
