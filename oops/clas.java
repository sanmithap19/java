package oops;

public class clas {
	public static void main(String[] args) {
		Pen p1=new Pen();
		p1.setcolor("yellow");
		System.out.println(p1.getcolor());
		p1.setTip(6);
		System.out.println(p1.gettip());
	}
}
	class Pen{
		private String color;
		private int tip;
		String getcolor() {
			return this.color;
		}
		int gettip() {
			return this.tip;
		}
		
		void setcolor(String newcolor) {
			color =newcolor;
		}
		
	
	void setTip(int newTip) {
		tip =newTip;
	}
	class student{
		String name;
		int age;
		float percentage;
	}
	
}


