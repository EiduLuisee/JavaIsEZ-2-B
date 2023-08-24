import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		
	Scanner unitScanner = new Scanner(System.in);
	Scanner numberScanner = new Scanner(System.in);
		
	System.out.println("Please enter the unit of measurement: ");
	String unit = unitScanner.next();
	
	System.out.println("Please enter the length: ");
	double length = numberScanner.nextDouble();
	System.out.println("Please enter the breadth: ");
	double breadth = numberScanner.nextDouble();
	
	double area = length * breadth;
	
	
	
	
	System.out.println("The area of the rectangle is: " + (int) area + " " + unit + "^2");
	}
}
