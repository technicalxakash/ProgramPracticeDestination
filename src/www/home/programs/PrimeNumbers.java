package www.home.programs;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		
		int num=2;
		
		for(int i=0;i<=num/2;i++) {
			if(num%2==0) {
				System.out.println("It is a not a prime number");
				System.exit(0);
		}
			
	}
		System.out.println("it is a prime number");
	}

}
