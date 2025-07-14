package Destina_Program2;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {

		String str="racecar";
		
		char[] a=str.toCharArray();
		String rev="";
		
		for(int i=a.length-1;i>=0;i--) {
			
			rev=rev+a[i];
			
		}

		if(str.equals(rev)) {
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
		}
		
	}

}
