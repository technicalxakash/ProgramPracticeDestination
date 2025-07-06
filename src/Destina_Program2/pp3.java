package Destina_Program2;

public class pp3 {

	public static void main(String[] args) {
		
		
		//int [] a= {1,2,3,4,5,6};
		
//		for(int i=a.length-1;i>=0;i--) {
//			System.out.print(a[i]+" ");
		
		
		int [] a= {1,2,2,4,1};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					break;
				}	
			}
			System.out.print(a[i]);
		}
		
		
		}

}


