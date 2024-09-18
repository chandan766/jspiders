/*
 * This program checks if a given number is a Spy number.
 * A Spy number is a number where the sum of its digits is equal to the product of its digits.
 * 
 * Example:
 * Input:  123
 * Output: True (as 1 + 2 + 3 = 6 and 1 * 2 * 3 = 6)
 * 
 * Input:  25
 * Output: False (as 2 + 5 = 7 and 2 * 5 = 10)
 */

import java.util.Scanner;
public class SpyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum=0;
        int mul=1;
        int t = n;
        while (n>0) {
            sum += n%10;
            mul *= n%10;
            n/=10;
        }
        if(sum==mul)
        System.out.println(t+" is a Spy number");
        else
        System.out.println(t+" is not a Spy number");
    }
}
