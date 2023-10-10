package OOP;

class Stack{
	char arr[]= new char[10];
	int ToS;
	
	Stack() {
		ToS= -1;
	}
	
	
	public void push(char val) {
		
		if(ToS==9) {
			System.out.println("Stack is Full");
		}
		else
		val=arr[++ToS];
		}
	
	
	public char pop(int i) {
		
		if(ToS>0) {
			return arr[--ToS];
		}
		return 0;
	}
	
}


public class StackArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack obj = new Stack();
		obj.push('A');
		obj.push('B');
		obj.push('C');
		obj.push('D');
		obj.push('E');
		
	//	obj.pop(3);

		System.out.println(obj);
	}

}
