package Exercise_2;

import java.util.Scanner;

public class Act_2_3 {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		int firstNumber, secondNumber, thirdNumber;
	
		System.out.println("Input a First Number: ");
		firstNumber = Scanner.nextInt();
		System.out.println("Input a Second Number: ");
		secondNumber = Scanner.nextInt();
		System.out.println("Input a Third Number: ");
		thirdNumber = Scanner.nextInt();
		
		
		if (firstNumber > secondNumber && firstNumber > thirdNumber) {
			System.out.println("The Greatest Number:  " + firstNumber);
		} 
		
		if (secondNumber > firstNumber && secondNumber > thirdNumber) {
			System.out.println("The Greatest Number:  " + secondNumber);
		}
		
		if (thirdNumber > secondNumber && thirdNumber > firstNumber) {
			System.out.println("The Greatest Number:  " + thirdNumber);
		}
		
		

	}

}
