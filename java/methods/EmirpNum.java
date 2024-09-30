/*
 * This program checks if a given number is an Emirp number.
 * An Emirp number is a prime number that remains prime when its digits are reversed.
 * 
 * Example:
 * Input:  13
 * Output: True (as 13 is prime and its reverse, 31, is also prime)
 * 
 * Input:  23
 * Output: False (as 23 is prime and its reverse, 32, is not prime)
 * 
 * Input:  17
 * Output: True (as 17 is prime, but its reverse, 71, is also prime)
 */

import java.util.Scanner;

public class EmirpNum {
    public static int reverse(int n){
        int m = 0;
        while(n>0){
            m = m*10+n%10;
            n/=10;
        }
        return m;
    }
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("Enter a num: ");
        int n = new Scanner(System.in).nextInt();
        if(isPrime(reverse(n)) && reverse(n)!=n){
            System.out.println(n+" is a Emrip Number");
        }
        else{
            System.out.println(n+" is not a Emrip Number");
        }
    }

}
