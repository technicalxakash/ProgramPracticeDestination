package www.home.programs;

public class BubbleSorttt {

	public static void main(String[] args) {
		
		int [] a= {1,2,8,7,6,5,9};
		int temp=0;
		
		for(int i=0;i<a.length-1;i++) {
			
			for(int j=0;j<a.length-i-1;j++) {
				
				if(a[j]>a[j+1]) {
					
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
			
		}
		for(int aa:a) {
			System.out.print(aa+" ");
		}

	}

}
