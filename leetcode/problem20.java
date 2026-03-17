package leetcode;
import java.util.Stack;
// done by stack

public class problem20 {


    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '[' ){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){return false;}
                char top = stack.pop();

                if  ((ch == ')' && top == '(') ||
                        (ch == '}' && top == '{') ||
                        (ch == ']' && top == '[')){
                    continue;
                } else{
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        problem20 sol = new problem20();
        String s = "()[{()}]";
        System.out.println(sol.isValid(s));
    }

}
