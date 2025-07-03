package www.home.programs;

public class FirstANDSecondLargestNumber {

	public static void main(String[] args) {
		
		int a[] = {1,2,8,7,6,5,9};
		int FirstLargest=a[0];
		int SecondLargest=a[1];
		
		if(a[0]<a[1]) {
			FirstLargest=a[1];
			SecondLargest=a[0];
			
		}
		else {
			FirstLargest=a[0];
			SecondLargest=a[1];
		}
		
		for(int i=0;i<a.length;i++) {
			
			if(FirstLargest<a[i]) {
				
				SecondLargest=FirstLargest;
				FirstLargest=a[i];

			}
			
		}
		
System.out.println(SecondLargest);
	}

}
