package Exercise_2;

import java.util.Scanner;

public class Act_2_4 {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("Input a Number: ");
		int number = Scanner.nextInt();
		System.out.println("Input Number: " + number);
	
		if (number == 0) {
			System.out.println("Zero");
		} 
		
		if (number > 1000000) {
	        System.out.print("Large ");
		}
		
	    if (number < 0){
	        System.out.print("Small ");
	    }
		
		if (number > 0) {
	        System.out.print("Positive Number");
		}
	    else {
	        System.out.print("Negative Number");
	    }
		
		
	}

}
