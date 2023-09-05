package Exercise_2;

import java.util.Scanner;

public class Act_2_5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number;
		do {
		System.out.println("Input a Number(1-7): ");
		number = scanner.nextInt();
		}while(number < 1 || number > 7);
		
		switch (number) {
		case 1:  {
			System.out.println("Monday");
			break;
		} 
		
		case 2: {
			System.out.println("Tuesday");
			break;
		} 
		
		case 3:  {
			System.out.println("Wednesday");
			break;
		} 
		
		case 4:  {
			System.out.println("Thursday");
			break;
		} 
		
		case 5:  {
			System.out.println("Friday");
			break;
		} 
		
		case 6: {
			System.out.println("Saturday");
			break;
		} 
		
		case 7:  {
			System.out.println("Sunday");
			break;
		} 
		}
		
	}

}
