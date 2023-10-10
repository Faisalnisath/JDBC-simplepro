package Basis;

public class SumOfArray {

	public static void main(String[] args) {
		
		int Array[]= {2,4,6,8,0};
		
		int sum=0;
		
		for(int i=0; i<Array.length; i++) {
			
			sum+= Array[i];
			}
		
		System.out.println("Sum of Array is: "+ sum);

	}

}
