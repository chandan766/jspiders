/*
 * This program checks if a given number is an Armstrong number.
 * An Armstrong number (or Narcissistic number) is a number that is equal to the sum of its own digits each raised to the power
 * of the number of digits.
 * 
 * Example:
 * Input:  153
 * Output: True (as 153 = 1^3 + 5^3 + 3^3 = 153)
 * 
 * Input:  123
 * Output: False (as 123 ≠ 1^3 + 2^3 + 3^3 = 36)
 */

import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {
        System.out.print("Enter a num: ");
        int n = (new Scanner(System.in)).nextInt();
        int num = n;
        int count=0;
        int sum =0;
        while (n>0) {
            count++;
            n/=10;
        }
        n = num;
        while (n>0) {
            int b = n%10;
            int mul = 1;
            for(int i=1;i<=count;i++){
                mul*=b;
            }
            sum += mul;
            n/=10;
        }
        if(sum==num){
            System.out.println(num+ " is Armstrong number");
        }else{
            System.out.println(num+ " is not Armstrong number");
        }
    }
    
}
