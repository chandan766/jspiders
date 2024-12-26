// write a java program to change upper case to lowercase?
package Programs;

public class Q19 {

    public static String toLowerCase(String s){
        char[] c = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(c[i]>=65 && c[i]<=90) c[i] = (char)(c[i]+32);
        }
        return new String(c);
    }

    public static void main(String[] args) {
        String s = "ChandaN Maurya";
        System.out.println(toLowerCase(s));
    }
    
}
