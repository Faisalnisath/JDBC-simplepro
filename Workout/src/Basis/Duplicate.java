package Basis;


public class Duplicate {

	public static void main(String[] args) {
		
		//int array[] = {2,4,5,6,4,3,2,1};
		
		String array1[] = { "Faisal", "Nisath", "Faisal", "Hilal"};
		
		for(int i=0; i<array1.length;i++) {
			for(int j=i+1; j<array1.length;j++) {
				
				if(array1[i]==array1[j]) {
					
					System.out.println("Duplicate Elements are: " + array1[j]);
					
				}
			}
		}
	}

}
