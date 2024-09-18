/*
 * This program checks if a given number is a Neon number.
 * A Neon number is a number whose sum of digits of its square is equal to the number itself.
 * 
 * Example:
 * Input:  9
 * Output: True (as 9^2 = 81 and 8 + 1 = 9)
 */

import java.util.Scanner;
public class NeonNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int sq = n*n;
        int sum = 0;
        while (sq>0) {
            sum += sq%10;
            sq/=10;
        }
        if(sum==n)
        System.out.println(n+" is Neon Number");
        else
        System.out.println(n+" is not a Neon Number");
    }
}
