package arrays;
import java.util.*;
public class pairs {

	public static void printpairs(int numbers[]) {
		for(int i=0;  i<numbers.length; i++) {
		int current=numbers[i];//2,4,6,8,10
		for(int j=i+1; j<numbers.length;j++) {
			System.out.print("("+ current +"," + numbers[j] +")");
		}
		System.out.println();
		}
				
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numbers[]= {2,4,6,8,10};
printpairs(numbers);
	}

}
