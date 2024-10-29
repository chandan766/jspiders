/*
  print two consecutive characters from a string
  input --> success
  output --> cc ss
 */
import java.util.Scanner;
public class TwoConsecutive {
    public static void main(String[] args) {
        System.out.print("Enter an String: ");
        String s = new Scanner(System.in).next();
        char[] arr = s.toCharArray();
        char pre = arr[0];
        for(int i=1;i<arr.length;i++){
            char cur = arr[i];
            if(pre==cur) {
                System.out.println(pre+""+cur);
                pre = ' ';
            }
            else pre = cur;
        }
    }
}
