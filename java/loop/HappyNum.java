/*
 * This program checks if a given number is a Happy number.
 * A Happy number is a number where, if you repeatedly replace the number with the sum of the squares of its digits, you eventually reach 1.
 * 
 * Example:
 * Input:  19
 * Output: True (as 19 is a Happy number: 19 → 82 → 68 → 100 → 1)
 * 
 * Input:  20
 * Output: False (as 20 leads to a cycle that does not include 1)
 */

import java.util.Scanner;
public class HappyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        int num = n;
        int sum=0;
        while (n>0) {
            int b = n%10;
            sum += b*b;
            n/=10;
            if(sum>9 && n==0){
                n = sum;
                sum = 0;
            }
        }
        if(sum==1){
            System.out.println(num+" is a Happy Number");
        }else{
            System.out.println(num+" is not a Happy Number");
        }
    }
}
