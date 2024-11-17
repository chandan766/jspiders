//write a java program to print vowel character in a String
package Programs;

import java.util.Scanner;

public class Q11 {
    public static void printVowels(String s){
        for(char c:s.toCharArray()){
            if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U'){
                System.out.print(c+" ");
            }
        }
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.next();
        printVowels(s);
    }
    
}
