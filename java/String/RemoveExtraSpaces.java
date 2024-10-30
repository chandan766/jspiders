/*
    Remove extra spaces present in string
    input-->  java    is   easy
    output--> java is easy
 */
import java.util.Scanner;
public class RemoveExtraSpaces {
    public static String removeExtraSpaces(String s){
        String s1 = "";
        for(int i=0;i<s.length();i++){
            while(i<s.length() && s.charAt(i)!=' '){
                s1+=s.charAt(i++);
            }
            if(i<s.length()-1 && s1.length()>0 && s1.charAt(s1.length()-1)!=' ') s1+=" ";
        }
        return s1;
    }

    public static void main(String[] args) {
        System.out.print("Enter an String: ");
        String s = new Scanner(System.in).nextLine();
        System.out.println(s);
        System.out.println(removeExtraSpaces(s));

    }
}
