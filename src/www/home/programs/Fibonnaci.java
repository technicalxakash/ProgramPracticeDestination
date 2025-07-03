package www.home.programs;

public class Fibonnaci {

	public static void main(String[] args) {
		
		
		int FirstNumber=0;
		int SecondNumber=1;
		int temp=0;
		
		for(int i=0;i<10;i++) {
			
			System.out.println(FirstNumber);
			temp=FirstNumber+SecondNumber;
			SecondNumber=FirstNumber;
			FirstNumber=temp;
			
		}

	}

}
