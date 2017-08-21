import java.util.Scanner;


public class binaryorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	        System.out.println("Enter the number: ");
	        int x = input.nextInt();
	        binaryorNot bd = new binaryorNot();
	      
	       System.out.println( bd.binarycheck(x));
	}

	 public boolean binarycheck(int x){
         
	        boolean a = true;
	        while(true){
	            if(x == 0){
	                break;
	            } else {
	                int temp = x%10;
	                if(temp > 1){
	                    a = false;
	                    break;
	                }
	                x = x/10;
	            }
	        }
	        return a;
	    }

}
