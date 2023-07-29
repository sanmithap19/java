package bitmanupliation;

public class friendsparing {
	public static int friendsparing(int n) {
		if(n==1 || n==2) {
			return n;
			
		}
		return friendsparing(n-1)+(n-1) * friendsparing(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(friendsparing(3));
	}

}
