/*
write a java program to arrange a character in a string
input: "ram#123" output: "123#ram"
*/
package Programs;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        
        System.out.println(arrangeChar(s));
        
     }

     public static String arrangeChar(String s){
    	 String alpha="";
    	 String num ="";
    	 String other = "";
       
    	 for(char c:s.toCharArray()) {
    		 if(c>='0' && c<='9') num+=c;
    		 else if((c>='A' && c<='Z') || (c>='a' && c<='z')) alpha+=c;
    		 else other+=c;
    	 }
        return num+other+alpha;
     }
    
}
