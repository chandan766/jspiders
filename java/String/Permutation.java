/*
  printing all possible permutation of given string
  input: "abc"
  output: abc
          acb
          bac
          bca
          cba
          cab
 */
import java.util.Scanner;
public class Permutation {
   public static String swap(String s,int i,int j){
        char[] arr = s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j]; 
        arr[j]=temp;
        return new String(arr);
   }

   public static void permute(String s, int l, int r){
     if(l == r) System.out.println(s);
     else{
     for(int i=l;i<=r;i++){
          String s1 = swap(s,l,i);
          permute(s1,l+1,r);
     }
     }
   }
   public static void main(String[] args) {
     //    String s = "abc";
     System.out.print("Enter the string: ");
     String s = new Scanner(System.in).next();
     permute(s,0,s.length()-1);
   }
}  