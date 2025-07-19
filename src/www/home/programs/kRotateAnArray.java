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


System.out.println();

int [] ab1= new int[a.length-(k-1)];

for (int i1 = k-1, jj = 0; i1 < a.length; i1++, jj++) {
	
	
	ab1[jj]=a[i1];
	
}


int iii=0;

int  jjj=ab1.length-1;

int tempp=0;

while(iii<jjj) {
	
	temp=ab1[iii];
	ab1[iii]=ab1[jjj];
	ab1[jjj]=temp;
	
	iii++;
	jjj--;
}

for(int i1i:ab1) {
	System.out.print(i1i+" ");
}



	}

}
