// 
package Programs;

import java.util.Scanner;

public class Q9 {

    public static String replaceChar(String s){
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(s.charAt(i)=='a') arr[i] = '@';
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.next();
        System.out.println(replaceChar(s));
    }
    
}
