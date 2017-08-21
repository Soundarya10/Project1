
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Ammu is a Good Gal";
		String reverse;
        reverse = reverse(word);
        System.out.printf(" String : %s , reversed String %s %n", word, reverse);

	}

	private static String reverse(String word) {
		// TODO Auto-generated method stub
		if(word == null || word.isEmpty()){
            return word;
        }       
        String reverse = "";
        for(int i = word.length() -1; i>=0; i--){
            reverse = reverse + word.charAt(i);
        }
        return reverse;
	}

}
