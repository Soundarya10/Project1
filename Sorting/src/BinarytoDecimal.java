import java.util.Scanner;


public class BinarytoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input = new Scanner(System.in);
	        System.out.println("Enter the number: ");
	        int x = input.nextInt();
	        BinarytoDecimal bd = new BinarytoDecimal();
	      
	       System.out.println( bd.binarytodecimal(x));
	   
	}

	public int binarytodecimal(int x) {
		// TODO Auto-generated method stub
		 int decimal = 0;
	        int power = 0;
	        while(true){
	            if(x == 0){
	                break;
	            } else {
	                int tmp = x%10;
	                decimal += tmp*Math.pow(2, power);
	                x = x/10;
	                power++;
	            }
	        }
	        return decimal;
	}

}
