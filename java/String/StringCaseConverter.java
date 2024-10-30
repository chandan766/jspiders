/*
  Converting String into UpperCase, LowerCase , initCap
  input--> chandan
  output-:
  CHANDAN  (UpperCase)
  chandan  (LowerCase)
  Chandan  (initCap)
*/

import java.util.Scanner;
public class StringCaseConverter {
    public static String upperCase(String s){
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            int n = c[i]-32;
            if(c[i]>='a' && c[i]<='z') c[i]=(char)n;
        }
        return new String(c);
    }

    public static String lowerCase(String s){
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            int n = c[i]+32;
            if(c[i]>='A' && c[i]<='Z') c[i]=(char)n;
        }
        return new String(c);
    }

    public static String initCap(String s){
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            int n = c[i]-32;
            if(c[i]>='a' && c[i]<='z'){
                if(i==0 || c[i-1]==' ') c[i]=(char)n;
            } 
        }
        return new String(c);
    }

    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        String s = new Scanner(System.in).nextLine();
        // System.out.println(upperCase(s));
        // System.out.println(lowerCase(s));
        System.out.println(initCap(s));
    }
    
}
