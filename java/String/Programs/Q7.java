// write a java program to find index value "ash123" where key='s'
package Programs;

import java.util.Scanner;

public class Q7 {

    public static int indexOf(String s, char key){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==key)  return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        System.out.print("Enter key(char): ");
        char c = sc.next().charAt(0);
        System.out.println(indexOf(s,c));
    }
    
}
