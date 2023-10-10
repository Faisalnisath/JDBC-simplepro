package OOP;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList List = new ArrayList();
		
		List.add(1);
		List.add(2);
		List.add(3);
		List.add(4);
		List.add(5);
		
		List.add(3, "Faisal");
		List.trimToSize();
		
		System.out.println(List);

	}

}
