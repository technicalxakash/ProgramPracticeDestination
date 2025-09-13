import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter the number to check prime or not : ");
		int num=sc.nextInt();
		
		
		
		
		for(int i=2;i<=num/2;i++) {
			
			if(num%2==0) {

				System.out.println("it is not prime number");
				System.exit(0);
			}
			
		}
		System.out.println("it is  prime number");
	}

}
