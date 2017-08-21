
public class selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[]{1,6,7,2,9,3};
		System.out.println("array before sorting");
		for (int i = 0; i < array.length ; i++){
			System.out.println(array[i] );
		}
		selection(array);
		merge(array, 0, array.length-1);
		
		System.out.println("array after sorting");
		for (int i = 0; i < array.length ; i++){
			System.out.println(array[i] + ",");
		}

	}



	private static void selection(int[] array) {
		// TODO Auto-generated method stub
		
        for (int i = 0; i < (array.length-1); i++)
        {
            int min = i;
            for (int j = i+1; j < array.length; j++)
                if (array[j] < array[min])
                    min = j;
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
	
	//merge sort
	private static void merge(int[] array, int a, int b) {
		// TODO Auto-generated method stub
		
		 if (a < b)
	        {
	            // Find the middle point
	            int c = (a+b)/2;
	 
	            // Sort first and second halves
	            merge(array, a, c);
	            merge(array , c+1, b);
	 
	            // Merge the sorted halves
	            sort(array, a, c, b);
	        }
	}



	private static void sort(int[] array, int a, int c, int b) {
		// TODO Auto-generated method stub
		int n1 = c - a + 1;
        int n2 = b - c;
 
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        for (int i=0; i<n1; ++i)
            L[i] = array[a + i];
        for (int j=0; j<n2; ++j)
            R[j] = array[c + 1+ j];
 
 
      
        int i = 0, j = 0;
 
        int k = a;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                array[k] = L[i];
                i++;
            }
            else
            {
                array[k] = R[j];
                j++;
            }
            k++;
        }
 
        while (i < n1)
        {
            array[k] = L[i];
            i++;
            k++;
        }
 
        while (j < n2)
        {
            array[k] = R[j];
            j++;
            k++;
        }
    }
	}
	


