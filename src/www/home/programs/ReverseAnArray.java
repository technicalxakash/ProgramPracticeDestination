package www.home.programs;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,5,6,7};
		
		int i=0;
		int j=a.length-1;
		int temp=0;
		
		while(i<j) {
			
			temp=a[i];
			
			a[i]=a[j];
			
			a[j]=temp;
			
			i++;
			j--;
			
		}
for(int ii:a) {
	System.out.print(ii+" ");
	
}
	}

}
