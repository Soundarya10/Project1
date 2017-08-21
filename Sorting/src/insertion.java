
public class insertion {
	 
	    // Driver method
	    public static void main(String args[])
	    {        
	    	int array[] = new int[]{1,6,7,2,9,3};
			System.out.println("array before sorting");
			for (int i = 0; i < array.length ; i++){
				System.out.println(array[i] );
			}
			insertion(array);
			System.out.println("array after sorting");
			for (int i = 0; i < array.length ; i++){
				System.out.println(array[i] + ",");
			}
		}

		private static void insertion(int[] array) {
			// TODO Auto-generated method stub
			 int n = array.length;
		        for (int i=1; i<n; ++i)
		        {
		            
		            int j = i-1;
		 
		      
		            while (j>=0 && array[j] > array[i])
		            {
		                array[j+1] = array[j];
		                j = j-1;
		            }
		            array[j+1] = array[i];
		        }
		}
	

}
