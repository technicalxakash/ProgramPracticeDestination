package Destina_Program2;

class parents{
	
	void par() {
		System.out.println("the parents are good");
	}
}

class child extends parents{
	
	void chi1() {
		System.out.println("but akash is bad");
	}
}
	
class child2 extends child{
		
		void chi2() {
			System.out.println("but kishore is ____");
		}
	
	
}
public class oops {

	public static void main(String[] args) {
		
		
		child2 c2=new child2();
		
c2.chi1();
c2.chi2();
c2.par();
		
	}

}

