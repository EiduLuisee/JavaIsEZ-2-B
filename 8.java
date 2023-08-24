import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args) {
		
		Scanner intScanner = new Scanner(System.in);
		
		System.out.println("Please enter 3 numbers: ");
		int num1 = intScanner.nextInt();
		int num2 = intScanner.nextInt();
		int num3 = intScanner.nextInt();
		
			if ((num1 == num2 && num1 != num3 && num2 != num3) || (num1 != num2 && num2 == num3 && num1 != num3) || (num1 != num2 && num2 != num3 && num1 == num3)) {
				System.out.println("Any of two are equal.");

			}
			
			else if (num1 == num2 && num2 == num3 && num1 == num3) {
				System.out.println("All are equal.");
			}
		
	}

}
