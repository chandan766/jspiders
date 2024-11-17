//write a java program to convert string to char array without using in build function
package Programs;

import java.util.Scanner;
import java.util.Arrays;

public class Q5 {
    public static char[] tocharArray(String s){
        char[] arr = new char[s.length()];
        for(int i=0;i<arr.length;i++){
            arr[i] = s.charAt(i);
        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        System.out.println(Arrays.toString(tocharArray(s)));
    }
}
