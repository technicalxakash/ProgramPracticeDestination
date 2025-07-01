public class PerfectNumberr {

	static public boolean perfect(int num) {
		
		int fact=1;
		int addi=0;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			addi=addi+i;
		}
		if(fact==addi) {
			
			return true;
		}
		else {
			
			return false;
		}
	
	}
	
	public static void main(String[] args) {
		
		
		boolean res= PerfectNumberr.perfect(4);
		System.out.println(res);
		

	}

}
