/* print the first non repeative character 
    input: aaabcbaae
    output: c
*/

import java.util.Scanner;

public class FirstNonRepeativeChar {
    public static char firstNonRepeativeChar(String s){
        for(char c1:s.toCharArray()){
            int count=0;
            for(char c2:s.toCharArray()){
                if(c1==c2) count++;
            }
            if(count==1) return c1;
        }
        return ' ';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.next();
        System.out.println(firstNonRepeativeChar(s));
    }
}
