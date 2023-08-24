import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		
		Scanner stringScanner = new Scanner(System.in);
		
		System.out.println("Please enter two words: ");
		String firstWord = stringScanner.nextLine();
		String secondWord = stringScanner.nextLine();
		
		System.out.println("Output: " + firstWord + secondWord);
	}

}
