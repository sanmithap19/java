package arrays;

public class claci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deer d=new deer();
		d.eat();
	}
}

class animal{
	void eat() {
System.out.println("eats anything");		
	}
}
class deer extends animal{
	void eat() {
		System.out.println("eats grass");
	}
}


class calculator{
	int sum(int a, int b) {
		return a+b;
	} 

float sum(float a,float b) {
	return a+b;
	
}
int sum(int a,int b, int c) {
	return a+b+c;
}
}
