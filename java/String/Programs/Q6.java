/*
  write a java program to print sum of number present in a string
  input: "ash123" output:6
 */
package Programs;

import java.util.Scanner;

public class Q6 {

    public static int sumOfDigits(String s){
        int sum = 0;
        for(char c:s.toCharArray()){
            if(c>='0' && c<='9'){
                sum+=c-'0';
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.next();
        System.out.println(sumOfDigits(s));

    }
    
}
