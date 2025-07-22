package Date22_07_2025;

public class Fibnocci {

	public static void main(String[] args) {
		
		int FirstNumber=0;
		int SecondNumber=1;
int temp=0;
		for(int i=0;i<20;i++) {
			System.out.println(FirstNumber);
			temp=FirstNumber+SecondNumber;
			SecondNumber=FirstNumber;
			FirstNumber=temp;
			
			
		}

	}

}
