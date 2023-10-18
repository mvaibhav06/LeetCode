public class RobotReturnToOrigin {
    public static boolean canReturnToOrigin(String s){
        int[] L = {-1,0};
        int[] R = {1,0};
        int[] U = {0,1};
        int[] D = {0,-1};
        int[] start = {0,0};
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            switch (ch){
                case 'L':
                    start[0] += L[0];
                    start[1] += L[1];
                    break;


                case 'R':
                    start[0] += R[0];
                    start[1] += R[1];
                    break;

                case 'U':
                    start[0] += U[0];
                    start[1] += U[1];
                    break;

                case 'D':
                    start[0] += D[0];
                    start[1] += D[1];
                    break;
            }
        }
        if (start[0]==0 && start[1]==0) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(canReturnToOrigin("UD"));
    }
}
