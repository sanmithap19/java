package bitmanupliation;

public class last {
	public static int lastoccurance(int arr[],int key,int i) {
		if(i==arr.length) {
			return -1;
		}
		int isfound=lastoccurance(arr,key,i+1);
		if(isfound==-1 && arr[i]==key) {
			return i;
		}
		
			return isfound;
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,7,3,2};
		System.out.println(lastoccurance(arr,5,0));

	}

}
