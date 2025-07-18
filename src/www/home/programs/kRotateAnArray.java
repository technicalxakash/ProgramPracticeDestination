package www.home.programs;



public class kRotateAnArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		
		
		
		int k=4;
		
		int[] aa = new int[k-1];
		
		int[] bb=new int[a.length - (k-1)];
		
		for(int i=0;i<k-1;i++) {
			
		    aa[i] = a[i];
			
			
		}
		
		int i=0;
		int j=aa.length-1;
		int temp=0;
		
		while(i<j) {
			
			temp=aa[i];
			
			aa[i]=aa[j];
			
			aa[j]=temp;
			
			i++;
			j--;
			
		}
for(int ii:aa) {
	System.out.print(ii+" ");
	
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
