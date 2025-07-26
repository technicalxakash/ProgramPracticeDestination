package SetOfPrograms;

public class PrimeNUmbers {

	static void prime(int num) {
		
		for(int i=0;i<=num/2;i++) {
			
			if(num%2==0) {
				
				System.out.println("It is not a prime");
				System.exit(0);
				
			}
			

		}
		System.out.println("it is a prime");
	}
	
	
	public static void main(String[] args) {

		
		
		prime(3);
		

	}

}
