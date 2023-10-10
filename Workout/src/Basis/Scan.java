package Basis;
import java.util.*;
public class Scan {

	public static void main(String[] args) {
		
		String Name;
		int Age;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Name:" );
		Name=input.nextLine();
	
		
		System.out.println("Enter your Age:" );
		Age=input.nextInt();
		
		System.out.println("Your Name is:" + Name);
		System.out.println("Your Age is:" + Age);
	}

}

