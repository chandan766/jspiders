/*
 * This program checks if a given number is an Automorphic number.
 * An Automorphic number is a number whose square ends with the same digits as the number itself.
 * 
 * Example:
 * Input:  5
 * Output: True (as 5^2 = 25, and the last digit is 5)
 * 
 * Input:  76
 * Output: True (as 76^2 = 5776, and the last two digits are 76)
 * 
 * Input:  625
 * Output: True (as 625^2 = 390625, and the last three digits are 625)
 */

import java.util.Scanner;
public class AutomorphicNum {
    public static void main(String[] args) {
        System.err.print("Enter a num: ");
        int n = (new Scanner(System.in)).nextInt();
        int num = n;
        int sq = n*n;
        boolean flag = true;
        while (n>0) {
            if(n%10!=sq%10){
                flag = false;
                break;
            }
            n/=10;
            sq/=10;
        }
        if(flag){
            System.out.println(num+" is Automorphic number");
        }else{
            System.out.println(num+" is not Automorphic number");
        }       
    }
    
}
