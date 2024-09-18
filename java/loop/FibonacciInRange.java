/*
 * This program generates Fibonacci numbers up to a given range number.
 * The program will include all Fibonacci numbers that are less than or equal to the specified range.
 * 
 * Example:
 * Input:  range = 50
 * Output: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 (as these are the Fibonacci numbers less than or equal to 50)
 */

import java.util.Scanner;
public class FibonacciInRange {
    public static void main(String[] args) {
        System.out.print("Enter a range num: ");
        int range = (new Scanner(System.in)).nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" "); 
        while(true){
            int c = a+b;
            a = b;
            b = c;
            if(c>range){
                break;
            }
            System.out.print(c+" ");
        }
    }
}
