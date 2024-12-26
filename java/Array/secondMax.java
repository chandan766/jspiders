public class secondMax {
    public static void main(String[] args) {
        int[] a = {1,4,6,8,-1,12,1,0};
		int max = Integer.MIN_VALUE;
		int secondMax = max;
		for(int i=0;i<a.length;i++){
			if(a[i]==max || a[i]==secondMax) continue;
			if(a[i]>max){
				secondMax = max;
				max = a[i];
			}else if(a[i]>secondMax){
				secondMax = a[i];
			}
			// System.out.println("max: "+max+" secondMax: "+secondMax);
		}
		System.out.println(secondMax);
    }
}
