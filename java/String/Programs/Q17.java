/*
  input: "java is very easy" output: avaj si yrev ysae"
 */
package Programs;

public class Q17 {

    public static String reverseEachWords(String s){
        String rev = "";
        for(int i=0;i<s.length();i++){
            String word = "";
            while(i<s.length() && s.charAt(i)!=' ') word+=s.charAt(i++);
            int len = word.length()-1;
            while(len>=0) rev += word.charAt(len--);
            if(i<s.length()) rev+=" ";
        }
        return rev;
    }
    public static void main(String[] args) {
        String s = "java is very   easy";
        System.out.println(s.length());
        System.out.println(reverseEachWords(s).length());
    }
}
