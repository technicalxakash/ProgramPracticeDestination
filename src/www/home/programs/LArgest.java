package www.home.programs;

public class LArgest {

	public static void main(String[] args) {
		int [] a= {1,2,8,7,6,5,9};
		
		
		int largest=a[0];
		
		for(int i =0;i<a.length;i++) {
			
			if(largest<a[i]) {
				
				largest=a[i];
			}
		}
		System.out.println(largest);
	}

}
