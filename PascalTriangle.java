import java.util.Arrays;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int input = sc.nextInt();
        int[] temp = {};
        int[][] solution = new int[input][];
        for(int i=0; i<input; i++){
            if(i==0){
                solution[i] = new int[]{1};
            } else if (i==1) {
                solution[i] = new int[]{1,1};
                temp = solution[i];
            }else {
                int len = temp.length + 1;
                solution[i] = new int[len];
                for(int j=0; j < len; j++){
                    if(j==0 || j==len-1){
                        solution[i][j] = 1;
                    }else {
                        solution[i][j] = temp[j] + temp[j-1];
                    }
                }
                temp = solution[i];
            }
        }
        for(int k=0; k<input; k++){
            System.out.print(Arrays.toString(solution[k] ) + ", ");
        }
    }
}
