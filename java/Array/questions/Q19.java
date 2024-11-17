/*
  Input-{1,2,3,4,5}
  output-{1,4,9,16,25} square of each element
 */
package questions;

public class Q19 {
    public static void squareOfele(int[] arr){
        for(int i:arr){
            int sq = i*i;
            System.out.print(sq+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        squareOfele(arr);
    }
    
}
