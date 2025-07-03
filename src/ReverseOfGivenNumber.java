
public class ReverseOfGivenNumber {

	public static void main(String[] args) {
	int num=12;
	int lastdigi=0;
	int rev=0;
	while(num>0) {
		
		lastdigi=num%10;
		rev=lastdigi;
		num=num/10;
		
		System.out.print(rev);
	}

	}

}
