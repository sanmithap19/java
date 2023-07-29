package recursionbasics;

public class calsum {
	public static int calsum(int n) {
		if(n==1) {
			return 1;
		}
		int snm1=calsum(n-1);
		int sn=n+snm1;
		return sn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		System.out.println(calsum(n));

	}

}
