public class DeleteColumnsToMakeSorted {
    public static int deletenonSortedColumns(String[] input){
        int counter = 0;
        for (int i=0; i<input[0].length(); i++){
            for (int j=1; j<input.length; j++){
                if (input[j].charAt(i) >= input[j-1].charAt(i)){
                    continue;
                }else {
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        String[] input = {"rrjk","furt","guzm"};
        System.out.println(deletenonSortedColumns(input));
    }
}
