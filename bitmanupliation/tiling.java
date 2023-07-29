package bitmanupliation;

public class tiling {
	public static int tilingproblem(int n){ //2xn (floor size)\
		// base case
		if(n==1 || n==0) {
			return 1;
		}
		
		//kaam
		//vertical choice
		int fnm1 =tilingproblem(n-1);
		
		//horizontal choice
		int fnm2=tilingproblem(n-2);
		int totalways= fnm1+fnm2;
		return totalways;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(tilingproblem(5));
	}

}
