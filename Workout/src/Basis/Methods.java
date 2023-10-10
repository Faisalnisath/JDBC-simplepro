package Basis;


public class Methods {

	public void StudentName(String Name) {
		System.out.println("Your Name is:" + Name);
	}

	public void StudentName(String Name, int Age) {
		System.out.println("Your Name is:"+ Name);
		System.out.println("Your Age is:"+ Age);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methods obj = new Methods();
		
		obj.StudentName("Faisal");
		obj.StudentName("Faisal",22);
		

				
	}


}
