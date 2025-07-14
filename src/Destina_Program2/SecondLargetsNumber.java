package Destina_Program2;

public class SecondLargetsNumber {

	public static void main(String[] args) {
		
		int a[]= {1,2,66,5,43,44,56,22};
		
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
			else if(a[i]>max2 && a[i]!=max1) {
				max2=a[i];
			}
				
		}

		System.out.println(max2);
	}

}


