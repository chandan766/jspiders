/*
   write a java program to print palindrome words in a string?
   Input: eye level car boy? output: eye, level
 */
package Programs;

public class Q18 {
    public static boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        s = s.toLowerCase();
        while (i<j) {
            if(s.charAt(i++)!=s.charAt(j--)) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        String s = "eye level car boy?";
        for(int i=0;i<s.length();i++){
            String word="";
            while(i<s.length() && s.charAt(i)!=' ') word+=s.charAt(i++);
            if(isPalindrome(word)) System.out.print(word+" ");
        }
    }
}
