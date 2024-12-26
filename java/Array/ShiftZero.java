import java.util.Arrays;

public class ShiftZero {
    public static int[] shiftZeroLeft(int[] arr){
        int[] temp = new int[arr.length];
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) index++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0) temp[index++] = arr[i];
        }
        return temp;
    }

    public static int[] shiftZeroRight(int[] arr){
        int[] temp = new int[arr.length];
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0) temp[index++] = arr[i];
        }
        return temp;
    }

     public static void main(String[] args) {
        int[] a = {0,0,5,8,0,3,0,0,4,5,2,0};
        System.out.println(Arrays.toString(a));
        a = shiftZeroLeft(a);
        System.out.println(Arrays.toString(a));
        a = shiftZeroRight(a);
        System.out.println(Arrays.toString(a));
    }
}
