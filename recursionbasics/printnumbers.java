package recursionbasics;

public class printnumbers {
	public static void printdec(int n) {
		if(n==0) {
			System.out.println(n);
			return;
		}

		System.out.print(n+" ");
		printdec(n-1);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		printdec(n);

	}

}
