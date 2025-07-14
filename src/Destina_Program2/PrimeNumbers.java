package Destina_Program2;

public class PrimeNumbers {

	public static void main(String[] args) {
	
		int num=6;
		
		for(int i=2;i<=num/2;i++) {
			
			if(num%2==0) {
				System.out.println("it is not a prime ");
				System.exit(0);
			}
		}
		System.out.println("it is a prime");

	}

}
