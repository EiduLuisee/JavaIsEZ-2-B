import java.util.Scanner;

public class Exercise2 {
public static void main(String[] args){
		
		Scanner numberScanner = new Scanner(System.in);
		
	    System.out.println("Please enter the first number: ");
	    int num1 = numberScanner.nextInt();
	    
	    System.out.println("Please enter the second number: ");
	    int num2 = numberScanner.nextInt();
	    
	    System.out.println("The sum of the two numbers is: " + (num1 + num2));
	    System.out.println("The product of the two numbers is: " + (num1 * num2));
	}

}



