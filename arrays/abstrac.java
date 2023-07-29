package arrays;

public class abstrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Horse h=new Horse();
h.eat();
h.walk();
 
//Chicken c= new Chicken();
//c.eat();
//c.walk();

	}

}

 abstract class animals{
	 void eat() {
		 System.out.println("animal eats");
		 
	 }
	 abstract void walk();
	 
		 
		 
	 }
 class Horse extends animal{
	 void walk() {
		 System.out.println("walk on 4 legs");
	 }
	 class Chicken extends animal{
		 void walk() {
			 System.out.println("walk on 2 legs");
		 }
	 }
 }
 
	
	
