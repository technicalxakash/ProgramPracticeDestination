package www.home.programs;

import java.util.Arrays;

public class Anagramm {

	public static void main(String[] args) {
		
		
		String str1="Listen";
		
		String str2="Silent";
		
		String str11=str1.toLowerCase();
		String str22=str2.toLowerCase();
		
		
		char [] str111=str11.toCharArray();
		char [] str222=str22.toCharArray();
		
		Arrays.sort(str111);
		Arrays.sort(str222);
		
		if(Arrays.equals(str111, str222)) {
			System.out.println("It is a anagram");
			}
			else {
				System.out.println("It is not a anagram");
				
			}

	}

}
