/*
   Write a Java program to remove the elements present more than once.
   Input-{1,2,1,3,2,4}
   Output-{3,4}
 */
package questions;

public class Q26 {

    public static void removeOccurence(int[] arr){
      for(int a : arr){
        int count=0;
        for(int b: arr){
          if(a==b) count++;
        }
        if(count==1) System.out.print(a+" ");
      }
    }
    

    public static void main(String[] args) {
      int[] arr = {1,2,1,3,2,4};
      removeOccurence(arr);
    }
}
