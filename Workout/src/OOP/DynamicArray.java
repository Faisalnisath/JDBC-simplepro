package OOP;

import java.util.*;
public class DynamicArray {

	private int arr[];
	
	private static int size;
	private static int capacity;
	private static final int initialcapacity=10;
	
	DynamicArray(){
		size=0;
		arr = new int[initialcapacity];
		capacity = initialcapacity;
	}
	
	
	public void addValue(int val) {
		if(size==capacity) {
			expandArray();
		}
	
		arr[size++]=val;
	}

	private void expandArray() {
		capacity*=2;
		arr=java.util.Arrays.copyOf(arr, capacity);
		
	}
	
	public void Display() {
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
public static void main(String[] args) {
	
	int val, pos;
	DynamicArray obj = new DynamicArray();
	Scanner sc = new Scanner (System.in); 
	
		while(true) {
		
		
		System.out.println("---------List Menu--------");
		System.out.println("1. Insert at End");

		System.out.println("2. Display the ListArray");

		System.out.println("3. Insert at specified Position");
		System.out.println("4. Delete at specified Position");
		System.out.println("5. Exit");
		System.out.println("-----------------------------");
		

		System.out.println("Enter the choice: ");

		int choice=sc.nextInt();

		switch(choice) {
		case 1:
				System.out.println("Enter the Data: ");
				val=sc.nextInt();
				obj.addValue(val);
				break;
				
		case 2:
				obj.Display();
				break;
				
		case 3:
				System.out.println("Enter the pos(it starts at 0)");
				pos =sc.nextInt();
				System.out.println("Enter the value: ");
				if(pos<0) {
					System.out.println("Invalid Position");
					break;
				}
				val=sc.nextInt();
			//	sc.InsertAtPos(pos, val);
				break;
				
		case 4:
				System.out.println("Enter the pos to be delete: ");
				pos=sc.nextInt();
				if(pos<0) {
					System.out.println("Invalid Position");
					break;
				}
				val=sc.nextInt();
			//	sc.DeleteAtPos(pos);
				break;
				
	/*	case 5:System.Exit("Exit");
		break;
		}
		*/

		
	
}
}
}
}
