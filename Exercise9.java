import java.util.Scanner;

public class Exercise9 {
	public static void main(String[] args){
		
		Scanner intScanner = new Scanner(System.in);
		
		System.out.println("Please input an int value for a: ");
		int a = intScanner.nextInt();
		System.out.println("Please input an int value for b: ");
		int b = intScanner.nextInt();
		
		System.out.println("a < 50: ");
		System.out.println(a<50);
		System.out.println("a < b: ");
		System.out.println(a<b);
	
		
	}

}
