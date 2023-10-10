package Basis;

public class WorkOuts {

	public void Name(String Name) {
		System.out.println("Your name is:" + Name);
		
	}
	
public class Workout extends WorkOuts{
	
	public void Name(String Name) {
		System.out.println("Your Name is:" + Name);
		
	}

	public static void main(String[] args){
		
		WorkOuts obj = new WorkOuts();
	
		obj.Name("Faisal");
		
	}

}

}
