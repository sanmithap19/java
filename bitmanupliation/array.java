package bitmanupliation;

public class array {
	public static boolean issorted(int arr[] ,int i) {
		if(i==arr.length-1) {
			return true;
		}
		if(arr[i] > arr[i+1]) {
			return false;
		}
		return issorted(arr,i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,6,2,8,9};
		System.out.println(issorted(arr,0));

	}

}
