//write a java program to find given string is palindrome or not
package Programs;

import java.util.Scanner;

public class Q4 {

    public static boolean isPalindrome(String s){
        if(s==null || s.length()<2) return false;
        int i=0,j=s.length()-1;
        while (i<j) {
            if(s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
    }
    
}
