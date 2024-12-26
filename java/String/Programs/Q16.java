/*
  write a java program for initcap of string 
    input: india that is bharat
    output: India That Is Bharat
 */
package Programs;

public class Q16 {

    public static String initCap(String s){
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(i==0 && c[i]!=' '){
                c[i] = (char)(c[i]-32);
            }
            else if((i>0 && c[i-1]==' ' && c[i]!=' ')){
                c[i] = (char)(c[i]-32);
            }
        }

        return new String(c);
    }

    public static void main(String[] args) {
        String s = " india    that is bharat  ";
        System.out.println(initCap(s));
    }
    
}
