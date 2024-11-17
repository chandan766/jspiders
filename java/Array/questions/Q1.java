//Write a Java program to store characters in an array and print the characters in reverse order.
package questions;

import java.util.Scanner;

public class Q1 {

    public static char[] reverse(char[] arr){
        int len = arr.length;
        char[] temp = new char[len];
        for(int i=len-1;i>=0;i--){
            temp[len-i-1] = arr[i];
        }
        return temp;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Characters: ");
        String s = sc.next();
        char[] arr = new char[s.length()];
        for(int i=0;i<arr.length;i++){
            arr[i] = s.charAt(i);
        }

        for(char c:reverse(arr)){
            System.out.print(c+" ");
        }
    }
    
}
