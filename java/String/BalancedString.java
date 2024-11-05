/*
   Verify a given string is a balanced string
   input: [{()}]
   output: true;
 */
import java.util.Scanner;
import java.util.Stack;
public class BalancedString {
    public static boolean isBalanced(String s){
        char[] c = s.toCharArray();
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<c.length;i++){
            if(c[i]=='[' || c[i]=='{' || c[i]=='(') st.push(c[i]);
            else if(c[i]==']' || c[i]=='}' || c[i]==')'){
                if(st.isEmpty()) return false;
                char c1 = st.pop();
                if(!((c1=='[' && c[i]==']') || (c1=='{' && c[i]=='}') || (c1=='(' && c[i]==')'))) return false;
            }
        }
        return st.isEmpty();
    } 

    public static void main(String[] args) {
        System.out.print("Enter the String: ");
        String s = new Scanner(System.in).next();
        System.out.println(isBalanced(s));
    }
}
