package bitmanupliation;

public class power {
	public static int power(int x,int n) {
		if(n==0) {
			return 1;
		}
		//int xnm1=power(x,n-1);
		//int xn= x*xnm1;
		//return xn;
		return x*power(x,n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2,10)); 

	}

}
