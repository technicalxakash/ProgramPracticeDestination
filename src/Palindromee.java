
public class Palindromee {

	public static boolean pali(String str1) {
		
		
		char [] a=str1.toCharArray(); 
		String rev="";
		
		for(int i=a.length-1;i>=0;i--) {
			
			rev=rev+a[i];
			}
		if(str1.equals(rev)) {
			
			return true;
		}
		else {
			return false;
			}
		
		}	
	public static void main(String[] args) {
				
		boolean res= Palindromee.pali("mom");		
		System.out.println(res);

	}

}
