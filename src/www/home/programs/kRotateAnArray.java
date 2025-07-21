package www.home.programs;



public class kRotateAnArray {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60,70,80,90};
		
		
		int n=4;
		
		int k=n+1;
		
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


System.out.println();

int [] ca=new int[a.length];


for(int i2=0;i2<aa.length;i2++) {
	
	ca[i2]=aa[i2];
}

for(int i3=0;i3<ab1.length;i3++) {
	
	ca[aa.length+i3]=ab1[i3];
	
}

for(int num:ca) {
	System.out.print(num+" ");
}

System.out.println();

int i9=0;

int j9=ca.length-1;

int temppp=0;

while(i9<j9) {
	
	temppp=ca[i9];
	
	ca[i9]=ca[j9];
	
	ca[j9]=temppp;
	
	i9++;
	j9--;

}
System.out.print(n+" "+"Rotated array is : ");
for(int num1:ca) {
	System.out.print(num1+" ");
}



	}

}
