import java.util.*;
public class RightSideTriangle {

	public static void main(String[] args) {
		
		int NoOfRows;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the No.of Rows: ");
		NoOfRows=input.nextInt();
		
		for(int i=1;i<=NoOfRows;i++) {
			for(int j=i; j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");

			}
			System.out.println();
		}
	}

}
