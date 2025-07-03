import java.util.Scanner;

public class PrimeNumberss {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
		int num=sc.nextInt();
		
		for(int i=2;i<=num/2;i++) {
			if(num%2==0) {
				System.out.println("it is not a prime number");
				System.exit(0);
			}
			
		}
		System.out.println("it is  a prime number");
		

	}

}
