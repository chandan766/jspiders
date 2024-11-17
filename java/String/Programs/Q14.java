// input: helloworld output: he121w2r3d
package Programs;

import java.util.Scanner;

public class Q14 {

    public static String numencode(String s){
        char[] arr = s.toCharArray();

        for(int i=0;i<s.length();i++){
            int count = 0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                    if(count>1){
                        arr[i]='1';
                        arr[j]=(char)(count+'0');
                    }
                }
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.next();
        System.out.println(numencode(s));
    }
    
}
