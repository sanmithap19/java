package javaBasics;
import java.util.*;

public class bre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
do {
	System.out.println("enter your number :");
	int n=sc.nextInt();
	if(n%10==0) {
		continue;
	}
	System.out.println("your number was :"+n);
}while(true);
}

	}


