import java.util.Scanner;


public class towersofhanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		towersofhanoi towersOfHanoi = new towersofhanoi();
		 
         System.out.print("Enter number of discs: ");
         Scanner scanner = new Scanner(System.in);
         int discs = scanner.nextInt();
         towersOfHanoi.TOH(discs, "A", "B", "C");
         
         //remove vowels
         String str = "RemoveVowels";
         String abc = str.replaceAll("[aeiouAEIOU]", "");
         System.out.println(abc);
  
		
	}

	private void TOH(int n, String start, String aux, String end) {
		// TODO Auto-generated method stub
        if (n == 1) {
            System.out.println(start + " -> " + end);
        } else {
            TOH(n - 1, start, end, aux);
            System.out.println(start + " -> " + end);
            TOH(n - 1, aux, start, end);
        }
	}

}
