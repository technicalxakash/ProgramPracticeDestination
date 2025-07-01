
public class pattern {

	public static void main(String[] args) {
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		*
//		**
//		***
//		****
//		*****

		
//		String str="hello";
//		for(int i=0;i<str.length();i++) {
//			System.out.print(str.charAt(i));
//			System.out.print(str.charAt(i));
//			System.out.print(" ");
			
			//hh ee ll ll oo 
			
		for(int i=0;i<6;i++) {
			char c='A';
			for(int j=0;j<6-i;j++) {
				
				System.out.print(c++);
			}
			
			System.out.println(" ");
		}
			
//		ABCDEF 
//		ABCDE 
//		ABCD 
//		ABC 
//		AB 
//		A 
		
		
		//fib
//		int first=0;
//		int second=1;
//		int temp=0;
//		
//		for(int i=0;i<=10;i++) {
//			
//			System.out.println(first);
//			temp=first+second;
//			first=second;
//			second=temp;
//		}
	}

}
