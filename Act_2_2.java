package Exercise_2;

import java.util.Scanner;

public class Act_2_2 {

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("--Quadratic Equation--");
		System.out.println("Enter the coeffecients");
		
		System.out.println("Enter a: ");
		double a = Scanner.nextDouble();
		
		System.out.println("Enter b: ");
		double b = Scanner.nextDouble();
		
		System.out.println("Enter c: ");
		double c = Scanner.nextDouble();
		
		double discriminant = b * b -4 * a * c;
		
		if (discriminant > 0) {
			double rootOne = (-b + Math.sqrt(discriminant)) / 2 * a;
			double rootTwo = (-b - Math.sqrt(discriminant)) / 2 * a;
			System.out.println("The roots are: " + rootOne + " and " + rootTwo );
		} 
		else if(discriminant == 0) {
			double rootThree = (-b / 2 * a);
			System.out.println("The root is: " + rootThree );
		}
		else {
			double rootFour = (-b / 2 * a);
			double rootFive = (-b + Math.sqrt(-discriminant)) / 2 * a; 
			System.out.println("The roots are: " + rootFour + " and " + rootFive);
		}
		
	}

}
