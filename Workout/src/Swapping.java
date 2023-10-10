import java.util.*;
public class Swapping {

	public static void main(String[] args) {
		
		int a , b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to Swap:");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("Before Swapping: " + a );
		System.out.println("Before Swapping: " + b );
		
		a= a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping: " + a);
		System.out.println("After Swapping: " + b);


	
	}

}
