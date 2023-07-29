package bitmanupliation;
import java.util.*;
public class power2 {
	public static boolean ispoweroftwo(int n) {
		return( n&(n-1))==0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ispoweroftwo(8));

	}

}
