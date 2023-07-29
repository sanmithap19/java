package bitmanupliation;
import java.util.*;
public class setbits {
	public static int countsetbits(int n ) {
		int count=0;
		while(n>0) {
			if((n & 1)!=0) {
				count++;
			}
		n=n>>1;
	}
	return count;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countsetbits(20));

	}

	}
