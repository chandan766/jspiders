/*
   Q20: input: Ramana
    Output: R
            Ra
            Ram
            Rama
            Raman
            Ramana
 */
package Programs;

public class Q20 {

    public static void main(String[] args) {
        String s = "Ramana";
        for(int i=0;i<s.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
    
}
