package javaBasics;

public class characterpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=4;
char ch='a';
for(int line=1; line<=n; line++) {
	for(int chars=1; chars<=line; chars++) {
		System.out.print(ch);
		ch++;
	}
	System.out.println();
}

	}

}
