package sortingalgorithm;

     public class bubble {
    public static void bubblesort(int arr[]) {
	//outer loop
	for(int turn=0;turn<arr.length-1;turn++) {
		//inner loop
	for(int j=0;j<arr.length-1-turn;j++) {
		if(arr[j]>arr[j+1]) {
			//swap
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			
		}
	  }
	}
}
      public static void printArr(int arr[]) {
	for(int i=0; i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {5,4,1,3,2};
    bubblesort(arr);
    printArr(arr);
	}

}
