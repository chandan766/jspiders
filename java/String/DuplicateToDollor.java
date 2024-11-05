/*
    replace the duplicate character with $
    input: Boss
    output: Bos$
    input: Banana
    output: Ban$$$
 */

import java.util.Scanner;
public class DuplicateToDollor {
    public static String duplicateToDollor(String s){
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i]==c[j]) c[j] = '$';
            }
        }
        return new String(c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        System.out.println(duplicateToDollor(s));
    }
}
