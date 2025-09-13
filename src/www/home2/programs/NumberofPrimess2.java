package www.home2.programs;

public class NumberofPrimess2 {

	static void prime(int n) {
		
		
		
	for(int i=2;i<=n/2;i++) {
		
		if(n%i==0) {
			
			return;
		}
		
	}	
		System.out.println(n);
	}
	
	
	public static void main(String[] args) {
		
		
		for(int i=2;i<=20;i++) {
			
			prime(i);
		}
	}

}


