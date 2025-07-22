package Date22_07_2025;



public class PalindromeStrings {

	static void revserse(char[] ch) {
		
		int i=0;
		int j=ch.length-1;
		
		while(i<j) {
			
			char temp=ch[i];
			
			ch[i]=ch[j];
			
			ch[j]=temp;
			
			i++;
			j--;

		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		String str="racecarr";
		
		char [] ch=str.toCharArray();
		
		revserse(ch);
		
		

		String str1=new String(ch);
		
		if(str.equals(str1)) {
			
			System.out.println("palindrome");
			
		}
		else {
			
			System.out.println("not palindrome");
		}
		
	}

}
