/*
  Check given String is a Palindrome (ignore case)
  input --> malayam
  output--> true
 */
import java.util.Scanner;
public class Palindrome {
    public static boolean palindrome(String s){
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        int i=0,j=arr.length-1;
        while(j>=0){
            if(arr[i++]!=arr[j--]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        System.out.println(palindrome((s)));
    }
    
}
