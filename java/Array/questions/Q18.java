/*
  Write a Java program to find the minimum occured element in a given array.
  Input-{1,2,1,1,2,1}
  Output-{2-2}
 */
package questions;

public class Q18 {

    public static void minOccurence(int[] arr){
        int min=arr.length,n=0;
        for(int i:arr){
            int count=0;
            for(int j:arr){
                if(i==j) count++;
            }
            if(count<min){
                min = count;
                n=i;
            }
        }
        System.out.println(n+"-"+min);
    }


    public static void main(String[] args) {
        int[] arr = {1,2,1,1,2,1};
        minOccurence(arr);
    }
    
}
