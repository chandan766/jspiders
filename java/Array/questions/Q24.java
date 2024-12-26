/*
    Write a Java program to convert 0 into -1 and -1 into 0.
    Input-{0,2,-1,0,2,-1,3}
    Output-{-1,2,0,-1,2,0,3}
 */ 
package questions;

import java.util.Arrays;

public class Q24 {
    public static void replaceZero(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) arr[i] = -1;
            else if(arr[i]==-1) arr[i] = 0;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,2,-1,0,2,-1,3};
        replaceZero(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    
}
