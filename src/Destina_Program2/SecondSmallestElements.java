package Destina_Program2;

public class SecondSmallestElements {

	public static void main(String[] args) {
		int [] a= {1,2,66,5,43,44,56,22};
		
		int min1=a[0];
		int min2=a[0];
		
		if(a[0]<a[1]) {
			min1=a[0];
			min2=a[1];
		}
		else {
			min1=a[1];
			min2=a[0];
			
		}

		for(int i=2;i<a.length;i++) {
			if(min1>a[i]) {
				
				min2=min1;
				min1=a[i];
			}
			else if(min2>a[i]){				
				min2=a[i];
			}
		}
		System.out.println(min2);
	}

}


