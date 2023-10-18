import java.util.Stack;

public class ValidParentheses {
    public static boolean isValidParentheses(String inp){
        Stack<Character> temp = new Stack<>();
        for (int i=0; i<inp.length(); i++){

            if (inp.charAt(i)==40 || inp.charAt(i)==91 || inp.charAt(i)==123){
                temp.push(inp.charAt(i));
            }else {
                if (temp.isEmpty()){
                    return false;
                }
                char top = temp.peek();
                char current = inp.charAt(i);
                if ((current==41 && top==40) || (current==93 && top==91) || (current==125 && top==123)){
                    temp.pop();
                    continue;
                }else {
                    return false;
                }
            }
        }
        return temp.isEmpty();
    }
    public static void main(String[] args) {

        System.out.println(isValidParentheses("()"));


    }
}
