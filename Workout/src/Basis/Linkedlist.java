package Basis;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		
		LinkedList<Integer> obj = new LinkedList<Integer>();
		
		
		obj.add(5);
		obj.add(2);
		obj.add(4);
		obj.addFirst(1);
		obj.addLast(6);
		obj.push(9);
		//obj.pop();
		obj.toString();
		System.out.println(obj);
	

		
	}

}
