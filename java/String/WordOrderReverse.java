/*
  Reverse the words of given string
  input--> java is easy
  output--> easy is java
 */
import java.util.Scanner;
public class WordOrderReverse {
    public static String wordOrderReverse(String s){
        String s1 = "";
        for(int i=s.length()-1;i>=0;i--){
            String t="";
            while(i>=0 && s.charAt(i)!=' ') t+=s.charAt(i--);
            int len = t.length()-1;
            while(len>=0) s1+=t.charAt(len--);
            if(i>0) s1+=" ";
        }
        return s1;
    }
    public static void main(String[] args) {
        System.out.print("Enter the String: ");
        String s = new Scanner(System.in).nextLine();
        System.out.println(s);
        System.out.println(wordOrderReverse(s));
    }
}
