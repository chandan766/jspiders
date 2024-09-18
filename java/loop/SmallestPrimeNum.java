/*
 * This program finds the minimum prime number in a given range.
 * The range is specified by a starting value and an ending value.
 * 
 * Example:
 * Input:  Starting value = 10, Ending value = 30
 * Output: 11 (as the prime numbers in the range are 11, 13, 17, 19, 23, 29, and 11 is the minimum prime number)
 */

import java.util.Scanner;
public class SmallestPrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting range: ");
        int st = sc.nextInt();
        System.out.print("Enter ending range: ");
        int end = sc.nextInt();
        for(int i=st;i<=end;i++){
            boolean flag = i<=1?false:true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println("Smallest prime number is "+i+" in range "+st+" to "+end);
                break;
            }
            
        }
    }
    
    
}
