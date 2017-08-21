
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[]{1,6,7,2,9,3};
		System.out.println("array before sorting");
		for (int i = 0; i < array.length ; i++){
			System.out.println(array[i] );
		}
		bubblesort(array);
		System.out.println("array after sorting");
		for (int i = 0; i < array.length ; i++){
			System.out.println(array[i] + ",");
		}
	}

	private static void bubblesort(int[] array) {
		// TODO Auto-generated method stub
		int temp = 0;
		
		for (int i = 0; i < array.length ; i++){
			for(int j = 1; j < (array.length-i) ; j++){
				  if(array[j-1] > array[j]){
				temp = array[j-1];
				array[j-1] = array[j];
				array[j] = temp;
				  }
			}
		}
		
	}

}
