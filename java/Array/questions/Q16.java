/*
   Write a Java program to count the occurrence of each element in a given array.
   Input-{1,2,1,3,2,4}
   Output-{1-2, 2-2, 3-1, 4-1}
 */
package questions;

public class Q16 {

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

    public static void occurrence(int[] arr){
        int[] temp = removeDuplicate(arr);
        for(int t:temp){
            int count=0;
            for(int i:arr){
                if(t==i) count++;
            }
            System.out.print(t+"-"+count+" ");
        }
        
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2,4};
        occurrence(arr);
    }
    
}
