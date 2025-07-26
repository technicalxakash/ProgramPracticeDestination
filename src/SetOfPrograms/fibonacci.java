package SetOfPrograms;

public class fibonacci {

	
	static void fib(int num) {
		
		int firstnum=0;
		int seconnum=1;
		
		for(int i=0;i<=num;i++) {
			System.out.println(firstnum);
			int temp=firstnum+seconnum;
			seconnum=firstnum;
			firstnum=temp;
		}
	}
	
	public static void main(String[] args) {
		
		fib(10);// TODO Auto-generated method stub

	}

}
