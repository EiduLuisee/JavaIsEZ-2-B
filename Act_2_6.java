package Exercise_2;

import java.util.Scanner;

public class Act_2_6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input floating-point number: ");
		float numberOne = scanner.nextFloat();
		System.out.println("Input floating-point another number: ");
		float numberTwo = scanner.nextFloat();
		
		if (numberOne != numberTwo) {
			System.out.println("They are Differnt");
		} else {
			System.out.println("They are the same");
		}
		
		
	}
		

}
