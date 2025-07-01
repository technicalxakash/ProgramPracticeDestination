
public class ArmStrongNumber {

	public static void main(String[] args) {
		int num=153;
		int copy=num;
		int lastdigi=0;
		int digi=0;
		int count=0;
		int armnum=0;
		int sum=0;

		while(num>0) {
			
			lastdigi=num%10;
			count++;
			num=num/10;
			
		}
		
//System.out.println(count);

while(copy>0) {
		lastdigi=copy%10;
		armnum=(int) Math.pow(lastdigi, count);
		sum=sum+armnum;
		copy=copy/10;		
}

System.out.println(sum);
	}

}
