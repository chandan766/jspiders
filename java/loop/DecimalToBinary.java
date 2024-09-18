/*
 * This program converts a decimal number to its binary equivalent.
 * The program will output the binary representation of the given decimal number.
 * 
 * Example:
 * Input:  10
 * Output: 1010 (as 10 in decimal is 1010 in binary)
 */

import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        int bin=0;
        int m = 1;
        while(n>0){
            int t = n%2;
            bin=t*m+bin;
            m*=10;
            n/=2;
        }
        System.out.println(bin);
    }
}
