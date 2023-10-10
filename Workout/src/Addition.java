import java.util.ArrayList;
public class Addition {

	public static void main(String[] args) {
		
		ArrayList<Integer> obj = new ArrayList<Integer>();
		
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		obj.add(6);
		
		int sum=0;
		
		for(int num:obj) {
		
			
		sum+= num;
		
		
		System.out.println(sum);

		
}
}}