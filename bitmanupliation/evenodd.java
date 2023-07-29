package bitmanupliation;
import java.util.*;

public class evenodd {
	public static void oddoreven(int n) {
	int bitmask=1;
	if((n & bitmask)==0) {
		//even number
		System.out.println("even number");
	}
	else
	{
		System.out.println("odd number");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oddoreven(3);
		oddoreven(11);
		oddoreven(14);

	}

}
