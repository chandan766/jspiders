/*
 * This program checks if a given number is a Perfect number.
 * A Perfect number is a number that is equal to the sum of its proper divisors, excluding itself.
 * 
 * Example:
 * Input:  28
 * Output: True (as 28 = 1 + 2 + 4 + 7 + 14)
 */

import java.util.Scanner;
public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum += i;
            }
        }
        if(sum==n){
            System.out.println(n+" is a Perfect Number");
        }else{
            System.out.println(n+" is a Perfect Number");
        }
    }
}
