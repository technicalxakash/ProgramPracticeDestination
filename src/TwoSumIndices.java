
public class TwoSumIndices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {2,4,5,6};
		
		int target=6;
		
		for(int i=0;i<a.length-1;i++) {
			
			for(int j=i+1;j<=a.length-1;j++) {
				
				if(a[i]+a[j]==target) {
					
					System.out.println(i+" "+j);
					
					System.out.println(a[i]+" "+a[j]);
				}
				
			}
		}
	}

}
