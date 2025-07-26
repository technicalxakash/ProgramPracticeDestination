package SetOfPrograms;

public class SwapTwoNumber {

	static void swap(int a,int b) {
		
		a=a+b;
		b=a-b;
		a=a-b;
		
	System.out.println(a);	
	System.out.println(b);	
	
	}
	
	
	
	public static void main(String[] args) {
		
		swap(5,3);

	}

}
