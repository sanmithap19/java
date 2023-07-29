package array;
import java.io.*;
public class arr {
	public static void main (String args[])throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String S;
		int[]a=new int[10];
		int i;
		System.out.println("enter the elements of array");
		for(i=0;i<10;i++)
		{
			S=br.readLine();
			a[i]=Integer.parseInt(S);
			
			
		}
		System.out.println("to display elements as follows");
		for(i=0;i<10;i++) {
			System.out.println(a[i]);
		}
	}

}