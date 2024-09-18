/*
 * This program finds the second minimum prime number in a given range.
 * The range is specified by a starting value and an ending value.
 * 
 * Example:
 * Input:  Starting value = 10, Ending value = 30
 * Output: 13 (as the prime numbers in the range are 11, 13, 17, 19, 23, 29, and 13 is the second minimum prime number)
 */

import java.util.Scanner;
public class SecondMinPrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting range: ");
        int st = sc.nextInt();
        System.out.print("Enter ending range: ");
        int end = sc.nextInt();
        int count = 0;
        for(int i=st;i<=end;i++){
            boolean flag = i<=1?false:true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                count++;
                if(count==2){
                    System.out.println(i+" is the second minimum prime number");
                    break;
                }
            }
        }

        
    }
}
