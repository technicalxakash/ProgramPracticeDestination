package Destina_Program2;

public class pp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		int min=a[0];
//		int max=a[1];
//		
//		if(min<max) {
//			min=a[0];
//			max=a[1];
//			
//			
//		}
//		
//		else {
//			
//			min=a[1];
//			max=a[0];
//		}
//		int temp=0;
		//System.out.println(max);
		int a[] = {1,2,5,3,7};
		
		for(int i=0;i<a.length-1;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					
					System.out.print(a[j]+" ");
					break;
				}
								
			}
			
			//System.out.print();
		}
		}
	}


