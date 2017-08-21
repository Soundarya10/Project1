
public class quick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[]{1,6,7,2,9,3};
		System.out.println("array before sorting");
		for (int i = 0; i < array.length ; i++){
			System.out.println(array[i] );
		}
		quick(array, 0 , array.length - 1);
		System.out.println("array after sorting");
		for (int i = 0; i < array.length ; i++){
			System.out.println(array[i] + ",");
		}
	}

	private static void quick(int[] array , int low, int high) {
		// TODO Auto-generated method stub
		 if (low < high)
	        {
	            
	            int pi = partition(array, low, high);
	 
	            quick(array, low, pi-1);
	            quick(array, pi+1, high);
	        }
		
	}

	private static int partition(int[] array, int low, int high) {
		// TODO Auto-generated method stub
		int pivot = array[high]; 
        int i = (low-1); 
        for (int j=low; j<high; j++)
        {
          
            if (array[j] <= pivot)
            {
                i++;
                 int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
 
       
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
 
        return i+1;
	}

}
