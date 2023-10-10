import java.util.*;
public class Leapyear {

	public static void main(String[] args) {

		
		Scanner sv = new Scanner(System.in);
		System.out.println("Enter a year to be check whether it is leap year or not: ");
		
		int year= sv.nextInt();
		
		
		if(year%4==0) 
		System.out.println("leap year");

			
		else if(year%100==0) {
			System.out.println("leap year");
			
		}
		
		
		else if(year%400==0) {
			System.out.println("leap year");

		}
		
		else {
			System.out.println("Not a leap year");
		}
		
		
		
				
				
	}


}
