package arrays;

public class constructer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student s1=new student("sanmitha");
System.out.println(s1.name);
	}
	
	

	
}

class student{
int roll;	
String name;
student(String name){
this.name= name;
	
}
}