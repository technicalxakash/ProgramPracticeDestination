
public class SecondLargestElement {

	public static void main(String[] args) {
	
		
		int [] a= {100,324,2,1,0,102,1000};
		
		int max1=a[0];
		int max2=a[0];
		
		if(a[0]>a[1]) {
			max1=a[0];
			max2=a[1];
		}
		else {
			max1=a[1];
			max2=a[0];
		}


		
		for(int i=0;i<a.length;i++) {
			
			if(max1<a[i]) {
				max2=max1;
				max1=a[i];
				
			}
				
		}
		System.out.println(max1);
		System.out.println(max2);
		

	}

}
