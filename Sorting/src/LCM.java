import java.util.Scanner;


public class LCM {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int x = input.nextInt();
        int y = input.nextInt();
        
    int  z =   lcm(x,y);
      
      System.out.println(z);
     input.close();
	}

	private static int lcm(int x, int y) {
		// TODO Auto-generated method stub
		  int a;
	        a = (x > y) ? x : y; // a is greater number
	        while(true)
	        {
	            if(a % x == 0 && a % y == 0)
	                return a;
	            ++a;
	        }	
	}

}
