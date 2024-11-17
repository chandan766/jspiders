/*
  Write a Java program to print vowels present in an array.
  Input-{a,b,c,d,e,f,g}
  output-{a,e}
 */
package questions;

public class Q12 {

    public static void main(String[] args) {
        char[] arr = {'a','b','c','d','e','f','g'};
        for(char c:arr){
            if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U'){
                System.out.print(c+" ");
            }
        }
    }
    
}
