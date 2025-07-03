package www.home.programs;

public class Palindrome {

	public static void main(String[] args) {
		
		
		String str="racecar";
		String rev="";
		char [] a=str.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			
			rev=rev+a[i];
			
		}
		
		if(str.equals(rev)) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
		}
	}

}
