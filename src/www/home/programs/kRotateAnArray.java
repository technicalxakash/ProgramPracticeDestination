package www.home.programs;

import java.util.Arrays;

public class kRotateAnArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		
		
		
		int k=4;
		
		int[] aa = new int[k-1];
		
		int[] bb=new int[a.length - (k-1)];
		
		for(int i=0;i<k-1;i++) {
			
		    aa[i] = a[i];
			
			
		}
		
for(int g:aa) {
	
	System.out.print(g);
}




//int index = 0;
//
//for(int i=k-1;i<a.length;i++) {
//	
//   bb[index++]=a[i];
//	
//	
//}
//
//for(int gg:bb) {
//	
//	System.out.println(gg);
//}
//	

	}

}
