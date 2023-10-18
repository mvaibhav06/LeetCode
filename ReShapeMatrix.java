import java.util.ArrayList;
import java.util.Arrays;

public class ReShapeMatrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c){
        ArrayList<Integer> input = new ArrayList<>();
        for (int i=0; i<mat.length; i++){
            for (int j=0; j<mat[i].length; j++){
                input.add(mat[i][j]);
            }
        }
        if (r*c != input.size()){
            return mat;
        }else {
            int[][] output = new int[r][c];
            int k =0;
            for (int i=0; i<r; i++){
                for (int j=0; j<c; j++){
                    output[i][j] = input.get(k);
                    k++;
                }
            }
        }
        return mat;
    }
    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4}};
        System.out.println(matrixReshape(a,1,4));
    }
}
