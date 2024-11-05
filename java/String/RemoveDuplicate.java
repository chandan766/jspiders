/*
    Remove duplicate characters in given String
    input: jaaavvaa
    output: jav
 */

import java.util.Scanner;

public class RemoveDuplicate {
    public static String removeDuplicate(String s){
        String s1 = "";
        while(s.length()>0){
            String t = "";
            for(int j=0;j<s.length();j++){
                if(s.charAt(0)!=s.charAt(j)) t+=s.charAt(j);
            }
            s1+=s.charAt(0);
            s=t;
        }
        return s1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.next();
        System.out.println(removeDuplicate(s));

    }
}
