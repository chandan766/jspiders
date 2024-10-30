/*
  print only palindrome words from given string
  input--> madam sir madam
  output-->  madam madam
 */

import java.util.Scanner;
public class PalindromeWords {
    public static boolean isPalindrome(String s){
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        int i=0,j=arr.length-1;
        while(j>=0){
            if(arr[i++]!=arr[j--]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        String s = new Scanner(System.in).nextLine();
        String[] str = s.split(" ");
        for(String word: str){
            if(isPalindrome(word))
            System.out.println(word);
        }
    }
}
