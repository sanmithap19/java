package bitmanupliation;

public class logn {

	public static int optimisedpower(int a,int n) {
		if(n==0) {
			return 1;
		}
		int halfpowersq=optimisedpower(a,n/2)*optimisedpower(a,n/2);
		
		//if n is odd
		if(n%2 !=0) {
			halfpowersq=a*halfpowersq;
		}
		return halfpowersq;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int n=10;
		System.out.println(optimisedpower(a,n));

	}

}
