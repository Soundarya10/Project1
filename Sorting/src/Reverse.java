
public class Reverse {
//using reverse built in method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using string buffer 
		String word = "Ammuuuuu";
        String reverse = new StringBuffer(word).reverse().toString();
        System.out.printf(" original String : %s , reversed String %s  %n", word, reverse);
        
        //using stringbuilder
         word = "HelloWorld";
         reverse = new StringBuilder(word).reverse().toString();
        System.out.printf(" original String : %s , reversed String %s  %n", word, reverse);

	}

}
