package Basis;

public class Dimensions {

	public static void main(String[] args) {
		
		int Array[] []= {{2,4,6,8},{3,6,9,0}};		
		
		for(int i=0; i<Array.length; i++) {
			for(int j=0; j<Array[i].length; j++) {
				
				System.out.println("2D Array is: " + Array[i][j]);
				
			}
		}

	}

}
