package www.home2.programs;

public class PrimeNUmbersssssss {

	static void prime(int n) {
		
		 
		for(int i=2;i<=n/2;i++) {
			
			if(n%i==0) {
				
				System.out.println("it is not a prime number");
			}
		}
		System.out.println("it is a prime number");
	}

	public static void main(String[] args) {

		
		prime(3);
		
		
	}

}
