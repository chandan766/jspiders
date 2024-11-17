//write a java program to count vowel characters in a string
package Programs;

import java.util.Scanner;

public class Q10 {

    public static int countVowels(String s){
        int count=0;
        for(char c:s.toCharArray()){
            if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.next();
        System.out.println(countVowels(s));
    }
    
}
