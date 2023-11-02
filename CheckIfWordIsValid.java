import java.util.Stack;

public class CheckIfWordIsValid {
    public static boolean isValid(String s){
        Stack<Character> temp = new Stack<>();
        Stack<Integer> counters = new Stack<>();
        for (int i=0; i<s.length(); i++){
            temp.push(s.charAt(i));
        }
        int counter = 0;
        while (!temp.isEmpty()){
            if (counter == 0){
                if (temp.peek() == 'c'){
                    counter = 1;
                    temp.pop();
                    continue;
                }
                else {
                    return false;
                }
            }
            else if (counter ==  1){
                if (temp.peek() == 'c'){
                    counters.push(counter);
                    counter = 1;
                    temp.pop();
                    continue;
                }
                if (temp.peek() == 'b'){
                    counter = 2;
                    temp.pop();
                    continue;
                }
                else {
                    return false;
                }
            } else if (counter == 2) {
                if (temp.peek() == 'c'){
                    counters.push(counter);
                    counter = 1;
                    temp.pop();
                    continue;
                }
                if (temp.peek() == 'a'){
                    counter = counters.isEmpty() ? 0: counters.peek();
                    if (!counters.isEmpty()){
                        counters.pop();
                    }
                    temp.pop();
                    continue;
                }
                else {
                    return false;
                }
            }
        }
        return temp.isEmpty() && counter==0 ? true:false;
    }
    public static boolean isWordValid(String s){
        StringBuilder str = new StringBuilder(s);
        while (!str.isEmpty()){
            int idx = str.indexOf("abc");
            if (idx != -1){
                str.delete(idx, idx+3);
            }else {
                return false;
            }
        }
        return str.length()==0 ? true:false;
    }
    public static boolean isValidWord(String s){
        Stack<Character> temp = new Stack<>();
        for (int i=0; i<s.length(); i++){
            temp.push(s.charAt(i));
            char a = 0,b = 0,c = 0;
            if (s.charAt(i) == 'c' && temp.size()>=3){
                c = temp.pop();
                b = temp.pop();
                a = temp.pop();
                if (c=='c' && b=='b' && a=='a'){

                }else {
                    temp.push(a);
                    temp.push(b);
                    temp.push(c);
                }
            }

        }
        return temp.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValidWord("aaababccbcbc"));
    }
}
