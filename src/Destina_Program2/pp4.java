////package Destina_Program2;
////
////public class pp4 {
////
////	int age;
////	String name;
////	
////	public pp4(int a,String n) {
////		
////		this.age=a;
////		this.name=n;
////		
////		
////	}
////	
////	
////	public static void main(String[] args) {
////
////		
////		pp4 p=new pp4(2, "akash");
////		pp4 p1=new pp4(22, "a");
////		
////		System.out.println(p1.age);
////		
////		
////		
////	}
////
////}
//
//
//
//
//package Destina_Program2;
//
//abstract class Animal{
//	
//	abstract void sound();
//	
//	void eat() {
//		System.out.println("All elements are eat ");
//	}
//}
//
//
//class Dog extends Animal{
//	
//	void sound() {
//		
//		System.out.println("All dogs will bark");
//	}






//package Destina_Program2;
//
//abstract class Animal{
//	
//	abstract void sound();
//	
//	void eat() {
//		System.out.println("All elements are eat ");
//	}
//}
//
//
//class Dog extends Animal{
//	
//	void sound() {
//		
//		System.out.println("All dogs will bark");
//	}
//	
//	
//	
//}
//
//
//class elephant extends Animal{
//	
//	void sound() {
//		
//		System.out.println("All elephant will horn");
//	}
//		
//}
//
//public class pp4 {
//
//	public static void main(String[] args) {
//
//		
//		
//		Dog d=new Dog();
//		d.eat();
//		d.sound();
//		
//	}
//
//}




package Destina_Program2;

interface Animal{
	
	int y=20;
	void eat();
	void sleep();
	
}

class Dog implements Animal{

	public void eat() {
		System.out.println(y);
		System.out.println("All animal will eat");
		
	}
	
	public void sleep() {
		
		System.out.println("All animal will sleep");
	}

	
}


public class pp4 {

	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.eat();
		d.sleep();
		
	}

}




	
	
