import java.util.Scanner;


public class GCD {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input = new Scanner(System.in);
	        System.out.println("Enter the two numbers: ");
	        int x = input.nextInt();
	        int y = input.nextInt();
	        
	    int  z =   gcd(x,y);
	      
	      System.out.println(z);
	     input.close();   
	}

	private static int gcd(int x, int y) {
		// TODO Auto-generated method stub
		int r=0, a, b;
		
        a = (x > y) ? x : y; // a is greater number
        b = (x < y) ? x : y; // b is smaller number
 
        r = b;
        while(a % b != 0)
        {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
 
      
	}

}
