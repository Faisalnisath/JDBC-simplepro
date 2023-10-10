
public class sortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		int array[] = new int[] {4,3,6,8,2,1};
		
		for(int i=0;i<array.length;i++) {
			for(int j=i;j<array.length;j++) {
				
				if(array[i]>array[j]) {
					
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				
				System.out.println(array[i]);
				
				
			}
		}

	}

}
}