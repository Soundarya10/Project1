
public class maxtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int num[] = {4,23,67,1,76,1,98,13};
        maxtwo obj = new maxtwo();
        obj.findTwoMaxNumbers(num);
        
        
	}

	public void findTwoMaxNumbers(int[] num) {
		// TODO Auto-generated method stub
		 int maxOne = 0;
		 int maxTwo = 0;
		 
		for(int i:num){
		 
		    if(maxOne < i){
		           maxTwo = maxOne;
		           maxOne =i;
		     } else if(maxTwo < i){
		                maxTwo = i;
		     }
	}
		System.out.println("First Maximum Number: "+maxOne);
        System.out.println("Second Maximum Number: "+maxTwo);
	}
}

