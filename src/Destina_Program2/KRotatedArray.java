package Destina_Program2;



public class KRotatedArray {
	
	
	
	static void reverseONE(int [] a) {
		
int temp=a[0];
		
		for(int i=1;i<a.length;i++) {
			
			a[i-1]=a[i];
			
		}
	a[a.length-1]=temp;
		
	}
	
	static void reverse(int [] a,int k) {
		
		for(int i=0;i<k;i++) {
			reverseONE(a);
			
		}
	}
	
	

	public static void main(String[] args) {


		int [] a= {10,20,30,40,50,60,70,80};
		
		reverse(a,3);
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+" ");
		}
		
	}

}
