package Basis;

public class ReverseArray {

	public static void main(String[] args) {
		
		int array[]= new int[]{2,4,5,6,8,0};
		
	System.out.println("Original Array is:" );
		
		for(int i=0; i<array.length;i++) {
			
			System.out.println("Original Array is:" + array[i]);
		}
		System.out.println();
		
		for(int i=array.length-1; i>= 0; i--) {
			
			System.out.println("Reversed Array is:" + array[i]);
			
		}
	}


}
