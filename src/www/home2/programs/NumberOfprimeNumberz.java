package www.home2.programs;

public class NumberOfprimeNumberz {

	static void prime(int n) {
		
		boolean isprime=true;
		
	for(int i=2;i<=n/2;i++) {
		
		if(n%i==0) {
			isprime=false;
			break;
			
		}
	}	
		
	if(isprime) {
		
		System.out.println(n);
	}

	}
	
	
	public static void main(String[] args) {
		
		
		for(int i=2;i<=20;i++) {
			
			prime(i);
		}
	}

}
