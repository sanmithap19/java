package recursionbasics;

public class printinc {
	public static void printincr(int n) {
		if(n==1) {
			System.out.print(n+" ");
			return;
		}
		printincr(n-1);
		System.out.print(n+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		printincr(n);

	}

}
