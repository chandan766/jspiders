/* 
  Input-{23,55,57,93,10,1}
  Output-{5,1,3,3,1,1}
*/
package questions;

import java.util.Arrays;

public class Q25 {
    public static int sumUpInSingleDigit(int n){
        int sum=0;
        if(n<0) n = n*-1;
        while(n>0){
            sum+=n%10;
            n/=10;
            if(sum>9 && n==0){
                n = sum;
                sum=0;
            }
        }
        return sum;
   }



   public static void main(String[] args) {
        int[] arr = {23,55,57,93,10,1};
        for(int i=0;i<arr.length;i++){
            arr[i] = sumUpInSingleDigit(arr[i]);
        }

        System.out.println(Arrays.toString(arr));
   }
   
}
