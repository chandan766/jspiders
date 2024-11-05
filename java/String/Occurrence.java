/*
    print the occurrence of each character 
    input: jaaavva
    output: j = 1
            a = 5
            v = 2
  
 */

import java.util.Scanner;
public class Occurrence {

    public static void occurrence(String s){
        while(s.length()>0){
            int count=0;
            String s1 = "";
            for(int j=0;j<s.length();j++){
                if(s.charAt(0)==s.charAt(j)) count++;
                else s1+=s.charAt(j);
            }
            System.out.println(s.charAt(0)+" = "+count);
            s=s1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.next();
        occurrence(s);
    }
    
}
