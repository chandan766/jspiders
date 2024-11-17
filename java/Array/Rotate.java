public class Rotate {
    public static void rotate(int[] a){
        int len = a.length;
        int temp = a[len-1];
        for(int i=len-2;i>=0;i--){
            a[i+1]=a[i];
        }
        a[0] = temp;
    }

    public static void rotateNum(int[] a, int n){
        for(int i=0;i<n;i++){
            rotate(a);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        rotateNum(arr,0);
        for(int i:arr) System.out.print(i+" ");
    }
}
