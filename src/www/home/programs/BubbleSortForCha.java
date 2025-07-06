package www.home.programs;

import java.util.Arrays;

public class BubbleSortForCha {

	public static void main(String[] args) {
		String str="defacb";
		
		char [] a=str.toCharArray();
		
		char temp=' ';
		for(int i=0;i<a.length-1;i++) {
			
			for(int j=0;j<a.length-i-1;j++) {
				
				if(a[j]>a[j+1]) {
					
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}

	}
		
}
		System.out.println(a);

	}}