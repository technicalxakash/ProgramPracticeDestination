
public class OccuranceString {

	public static void main(String[] args) {
		
		char c='a';
		String str="java";
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==c) {
				
				count++;
				
			}
			
		}
		System.out.println(count);
		

	}

}
