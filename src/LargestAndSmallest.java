import java.util.Scanner;

public class LargestAndSmallest {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		
		int [] a=new int[n];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {
				max=a[i];
			}
			
			else if(a[i]<min){
				min=a[i];
			}
	
		}
		System.out.println("the smallest element is "+min);
		System.out.println("the largest element is "+max);
	}

}
