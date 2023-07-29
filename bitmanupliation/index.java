package bitmanupliation;

public class index {
	public static int firstoccurance(int arr[],int key,int i) {
		if(i==arr.length-1) {
			return -1;
		}
		if(arr[i]==key) {
			return i;
		}
		return firstoccurance(arr,key,i+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,4,5,2,3,7,5};
		System.out.println(firstoccurance(arr,5,0));

	}

}
