package Exercise_2;

import java.util.Scanner;

public class Act_2_1 {

	public static void main(String[] args) {
		Scanner numberScanner = new Scanner(System.in);
		
		System.out.println("Please enter number: ");
		
		int num = numberScanner.nextInt();
		
		if (num > 0) 
	        System.out.println("The number is Positive");
	    else
	        System.out.println("The number is Negative");
		}
	}


