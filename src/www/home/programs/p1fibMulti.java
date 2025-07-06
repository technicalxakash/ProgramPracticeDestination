package www.home.programs;

public class p1fibMulti {

	public static void main(String[] args) {

		int FirstNumber=1;
		int SecondNumber=2;
		int temp=1;
		
		for(int i=0;i<=10;i++) {
			
			System.out.println(FirstNumber);
			
			temp=SecondNumber*temp;
			SecondNumber=FirstNumber;
			FirstNumber=temp;
	
		}
	}

}
