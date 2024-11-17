// Write a java program to reverse a string
package Programs;
import java.util.Scanner;

public class Q1 {
    public static String reverse(String s){
        int len = s.length();
        char[] arr = new char[len];
        for(int i=len-1;i>=0;i--){
            arr[len-i-1] = s.charAt(i);
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        System.out.println(reverse(s));
    }
}
