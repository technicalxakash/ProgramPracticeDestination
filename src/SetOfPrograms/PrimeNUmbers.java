package SetOfPrograms;

public class PrimeNUmbers {

	static void prime(int num) {
		
		for(int i=2;i<=num/2;i++) {
			
			if(num%i==0) {
				
				System.out.println("It is not a prime");
				System.exit(0);
				
			}
			

		}
		System.out.println("it is a prime");
	}
	
	
	public static void main(String[] args) {

		
		
		prime(9);
		

	}

}
