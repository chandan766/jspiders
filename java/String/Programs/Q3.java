// write a java program to count words in a string
package Programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q3 {
    static int countWords(String s){
        if(s==null || s.length()==0) return 0;
        int count=0;
        Pattern p= Pattern.compile("([a-zA-Z0-9]+)");
        Matcher m= p.matcher(s);

        while(m.find()){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
       System.out.println("words: "+countWords(s));
    }
}
