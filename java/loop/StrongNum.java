/*
 * This program checks if a given number is a Strong number.
 * A Strong number (or factorial number) is a number where the sum of the factorials of its digits equals the number itself.
 * 
 * Example:
 * Input:  145
 * Output: True (as 1! + 4! + 5! = 1 + 24 + 120 = 145)
 * 
 * Input:  123
 * Output: False (as 1! + 2! + 3! = 1 + 2 + 6 = 9)
 */

import java.util.Scanner;
public class StrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        int num = n;
        int sum=0;
        while (n>0) {
            int t = n%10;
            int fact = 1;
            while (t>0) {
                fact *= t;
                t--;
            }
            sum += fact;
            n/=10;
        }
        if(num == sum){
            System.out.println(num+" is a Strong Number");
        }else{
            System.out.println(num+" is not a Strong Number");
        }
    }
}
