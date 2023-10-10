package OOP;
import java.util.*;

class DynamicArray {
	
	private int arr[];
	private int size;
	private int capacity;
	private final int initialcapacity=10;
	


DynamicArray(){
	
	size=0;
	arr=new int[initialcapacity];
	capacity=initialcapacity;
}

public void AddValue(int val) {
	
	if(size==capacity)
	expandArray();
	val=arr[size++];
}

public void DeleteAtEnd(int val) {
	
	for(int i=size-1;i>size;i--)
	arr[i]=arr[i-1];
	size--;
}

public void InsertAtBeginning(int pos, int val) {
	if(pos<size) {
		System.out.println("Invalid Position");
	}
	else {
		val=arr[size++];
		size++;
	}
		
}


private void expandArray() {
	capacity*=2;
	arr=java.util.Arrays.copyOf(arr, capacity);
}





public class Dynamic {

	public static void main(String[] args) {
		int val,pos;
		
		DynamicArray sc1= new DynamicArray();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("/n ----------List Menu-----------");
			System.out.println("1. Insert at End");
			System.out.println("2. Delete at End");
			System.out.println("/3. Insert From Beginning");

		//	System.out.println("4. Delete at specified position /n");
		//	System.out.println("5. Exit/n");
			
		//	System.out.println("/n -------------------------------/n");
			System.out.println("Enter your choice: ");
			int choice=sc.nextInt();	
			
			switch(choice) {
			
			case 1:
				System.out.println("Enter the value: ");
				int val = sc.nextInt();
				sc1.AddValue(val);
				break;
				
		case 2: 
				sc1.DeleteAtEnd(val);
				break;
		
			
	/*	case 4: System.out.println("Enter the pos(starts at 0): ");
			pos = sc.nextInt();
			if(pos<0) {
				System.out.println("Invalid Choice:");
				break;
			}
				sc.deleteAtPos(pos);
				break;
				
	/*	case 5: 
			System.exit(0);
			break;
			
		default:
			System.out.println("Invalid Choice");
				
	*/			
			
			
			}
		}

}

}
}