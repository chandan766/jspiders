//write a java program to print minimum occurrence character and its count in a string
// input: ramana output: r=1
package Programs;

import java.util.Scanner;

public class Q13 {
    public static void minOccurrenceChar(String s){
        int min = s.length();
        char c = s.charAt(0);
        while(s.length()>0){
            String temp = "";
            int count = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(0)==s.charAt(i)) count++;
                else temp+=s.charAt(i);
            }
            if(count<min){
                min = count;
                c = s.charAt(0);
            }
            s = temp;
        }
        System.out.println(c+"="+min);
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.next();
        minOccurrenceChar(s);
    }


}
