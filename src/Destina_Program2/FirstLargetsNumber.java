package Destina_Program2;

public class FirstLargetsNumber {

	public static void main(String[] args) {
		int [] a= {1,2,66,5,43,44,56,22};
		
		int max1=a[0];
		
		for(int i=0;i<a.length;i++) {
			
			if(max1<a[i]) {
				max1=a[i];
			}
		}
System.out.println(max1);
	}

}
