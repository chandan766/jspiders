/*
  Write a Java program to find the maximum occured element in a given array.
  Input-{1,2,1,3,1,4}
  Output-{1-3}
 */
package questions;

public class Q17 {

    public static void maxOccurence(int[] arr){
        int max=0,n=0;
        for(int i:arr){
            int count=0;
            for(int j:arr){
                if(i==j)count++;
            }
            if(count>max){
                max = count;
                n=i;
            }
        }

        System.out.println(n+"-"+max);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,1,4};
        maxOccurence(arr);
    }
    
}
