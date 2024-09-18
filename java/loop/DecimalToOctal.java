/*
 * This program converts a decimal number to its octal equivalent.
 * 
 * Example:
 * Input:  58
 * Output: 72
 * 
 */

import java.util.Scanner;
public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int octal = 0;
        int d = 1;
        while (n>0) {
            octal += (n%8)*d;
            d*=10;
            n/=8;
        }
        System.out.println(octal);
    }
}
