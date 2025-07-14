package Destina_Program2;

public class IndexEqual {

	public static void main(String[] args) {

		
		int [] a= {1,2,3,4};
		int target=6;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				
			if(target==a[i]+a[j]) {
				
				System.out.println(a[i]+" "+a[j]);
			}
			
			}
			}
		
	}

}
