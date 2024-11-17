// input: "AssmnAN" output: A=2, s=2, m=1, n=1, N=1
package Programs;

import java.util.Scanner;

public class Q8 {

    public static void occurrence(String s){

        while(s.length()>0){
            String temp="";
            int count=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(0)==s.charAt(i)) count++;
                else temp+=s.charAt(i);
            }
            System.out.println(s.charAt(0)+"="+count);
            s = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.next();
        occurrence(s);
    }
    
}
