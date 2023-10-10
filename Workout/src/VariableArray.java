
public class VariableArray {
	
	public void Add(int arr[], int n) {
		
		int First=0, second=0;
		for(int i=0;i<n;i++) {
			if(i<n/2) {
				First+= arr[i];
				System.out.println("First is: " + First);
			}
			else {
				second+= arr[i];
				System.out.println("Second is: " + second);
			}
		}
	}

	public static void main(String[] args) {
		
		VariableArray list = new VariableArray();
		int arr[]= {1,2,3,4,5,6};
		int n=arr.length;
		list.Add(arr,n);

}
}
