// remove duplicate elements from given array

import java.util.Arrays;

public class RemoveDuplicate {

    public static int[] removeDuplicate(int[] arr){
        int[] temp = new int[arr.length];
        int min = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            temp[i]=min;
        }
        int j=0;
        for(int i=0;i<arr.length;i++){
            boolean flag = true;
            for(int ele:temp){ 
                if(arr[i]==ele) {
                    flag=false;
                    break;
                }
            }
            if(flag) temp[j++]=arr[i];
        }
        int[] a = new int[j];
        for(int i=0;i<a.length;i++){
            a[i] = temp[i];
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,0,0,1,3,5,2,4,0,6,5,7,0,0};
        System.out.println(Arrays.toString(removeDuplicate(arr)));
    }
    
}
