// Write a java program to print maximum occurrence character and its count in a string
// input: ramana output: a=3
package Programs;

import java.util.Scanner;

public class Q12 {

    public static void maxOccurrenceChar(String s){
        int max = 0;
        char c = s.charAt(0);
        while(s.length()>0){
            String temp = "";
            int count = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(0)==s.charAt(i)) count++;
                else temp+=s.charAt(i);
            }
            if(count>max){
                max = count;
                c = s.charAt(0);
            }
            s = temp;
        }
        System.out.println(c+"="+max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.next();
        maxOccurrenceChar(s);
    }
    
}
