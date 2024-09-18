/*
 * This program reverses the digits of a given number.
 * The program will output the number with its digits in reverse order.
 * 
 * Example:
 * Input:  1234
 * Output: 4321
 */

import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        int rev = 0;
        while (n>0) {
            rev = (rev*10)+(n%10);
            n/=10;
        }
        System.out.println(rev);
    }
    
}
