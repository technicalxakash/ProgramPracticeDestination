package Destina_Program2;

import java.util.Arrays;

public class MultiplicationSeries {

	public static void main(String[] args) {

		int[] a= {1,2,3,4};
		
		int[] aa=new int[4];
		
		for(int i=0;i<a.length;i++) {
			int pro=1;
			
			for(int j=0;j<a.length;j++) {
				
			if(a[i]!=a[j]) {
				pro=pro*a[j];
	
			}	
			
			}
			aa[i]=pro;
		}
		//System.out.println(aa);
		System.out.println(Arrays.toString(aa));
	}

}
