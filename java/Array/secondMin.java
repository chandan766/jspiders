public class secondMin {
    public static void main(String[] args) {
        int[] a = {1,4,6,8,-1,-2,1,0};
		int min = Integer.MAX_VALUE;
		int secondMin = min;
		for(int i=0;i<a.length;i++){
			if(a[i]==min || a[i]==secondMin) continue;
			if(a[i]<min){
				secondMin = min;
				min = a[i];
			}else if(a[i]<secondMin){
				secondMin = a[i];
			}
			// System.out.println("min: "+min+" secondMin: "+secondMin);
		}
		System.out.println(secondMin);
    }
}
