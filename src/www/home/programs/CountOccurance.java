package www.home.programs;

import java.util.Scanner;

public class CountOccurance {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character ");
		char ch=sc.next().charAt(0);
		
		String str="java java abc abc";
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			
			if(ch==str.charAt(i)) {
				
				count++;
			}
		}
		System.out.println(ch+" = this count is "+count);

	}

}
