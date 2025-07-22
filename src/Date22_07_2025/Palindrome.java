package Date22_07_2025;

public class Palindrome {

	public static void main(String[] args) {
		
		int num=12111;
		int temp=0;
		int lastdigi=0;
		
		
		while(num>0) {
			
			temp=num%10;
			lastdigi=temp;
			num=num/10;
			System.out.print(lastdigi);
		}
		

	}

}
