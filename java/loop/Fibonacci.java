/*
 * This program generates a specified number of Fibonacci numbers.
 * The total number of Fibonacci numbers to be printed is determined by the input value.
 * 
 * Example:
 * Input:  Range = 5
 * Output: 0, 1, 1, 2, 3 (as these are the first 5 Fibonacci numbers)
 */

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");
        for(int i = 3;i<=n;i++){
            int c = a+b;
            a = b;
            b = c;
            System.out.print(c+" ");
        }
    }
}
