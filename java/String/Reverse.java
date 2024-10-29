/*
  Print reverse of String
  input --> chandan
  output --> nadnahc
 */
import java.util.Scanner;
public class Reverse {
    public static String reverse(String s){
        char[] c = s.toCharArray();
        char[] rev = new char[c.length];
        int j=0,i=c.length-1;
        while(i>=0){
            rev[j++] = c[i--];
        }
        return new String(rev);
    }
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        System.out.println(reverse(s));
    }
}
