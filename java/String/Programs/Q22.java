/*
    write a java program to print words in a given string,
    input: "Java Is Very Easy"
    Output: Java
            Is
            Very
            Easy
 */
package Programs;

public class Q22 {
    public static void printWords(String s){

        for(int i=0;i<s.length();i++){
            String word = "";
            while (i<s.length() && s.charAt(i)!=' ') word+=s.charAt(i++);
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        String s = "Java Is Very Easy";
        printWords(s);
    }
}
