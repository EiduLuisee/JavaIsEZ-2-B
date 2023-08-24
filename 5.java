import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		
		Scanner intScanner = new Scanner(System.in);
		Scanner stringScanner = new Scanner(System.in);
		
		System.out.println("Please enter the length of the side of the square: ");
		int side = intScanner.nextInt();
		
		System.out.println("Please enter the unit of measurement: ");
		String unit = stringScanner.nextLine();
		
		int area = side * side;
		int perimeter = side * 4;
		
		System.out.println("The area of the square is: " + area + " " + unit + "^2.");
		System.out.println("The perimeter of the square is: " + perimeter + " " + unit + ".");
		
		
	}

}
