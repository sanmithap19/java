package bitmanupliation;

public class fib {
	public static int fib(int n) {
		if(n==1 || n==0) {
			return n;
		}
		int fnm1=fib(n-1);
		int fnm2=fib(n-2);
		int fn=fnm1+fnm2;
		return fn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=25;
		System.out.println(fib(25));
		System.out.println(fib(26));
		System.out.println(fib(27));
		System.out.println(fib(28));
		System.out.println(fib(29));

	}

}
