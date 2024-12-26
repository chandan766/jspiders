//input: RaMana output: rAmANA?
package Programs;

public class Q15 {
    public static String toggleCase(String s){
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]>=65 && c[i]<=90){
                c[i] = (char)(c[i]+32);
            }else if(c[i]>=97 && c[i]<=122){
                c[i] = (char)(c[i]-32);
            }
        }

        return new String(c);
    }

    public static void main(String[] args) {
        String s = "RaMana";
        System.out.println(toggleCase(s));
    }
    
}
