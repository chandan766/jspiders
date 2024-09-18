/*
 * This program checks if a given year is a Leap year.
 * A Leap year is a year that is divisible by 4, but not divisible by 100, except for years that are divisible by 400.
 * 
 * Example:
 * Input:  2024
 * Output: True (as 2024 is divisible by 4 and not divisible by 100)
 * 
 * Input:  1900
 * Output: False (as 1900 is divisible by 100 but not by 400)
 * 
 * Input:  2000
 * Output: True (as 2000 is divisible by 400)
 */

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        System.out.print("Enter the year: ");
        int y = (new Scanner(System.in)).nextInt();
        if(y%4==0 && y%100!=0){
            System.out.println(y+" is a Leap Year");
        }
        else if(y%400==0){
            System.out.println(y+" is a Leap Year");
        }
        else{
            System.out.println(y+" is not a Leap Year");
        }
    }
}
