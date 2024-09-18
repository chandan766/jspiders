/*
 * This program converts a binary number to its decimal equivalent.
 * The program will output the decimal representation of the given binary number.
 * 
 * Example:
 * Input:  1010
 * Output: 10 (as 1010 in binary is 10 in decimal)
 */

import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary num:");
        int bin = sc.nextInt();
        int dec = 0;
        int m = 1;
        while(bin>0){
            dec+=(bin%10)*m;
            m*=2;
            bin/=10;
        }
        System.out.println(dec);
    }
}
