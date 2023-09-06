package Exercise_2;

import java.util.Scanner;
public class Act_2_8 {
	public static void main(String[] args) {
		
		Scanner charScanner= new Scanner(System.in); 
		
	    int i = 0;  
        System.out.print("Enter a single character from the alphabet: "); 
        char character = charScanner.next().charAt(0);
        
        switch (character) {
    		case 'a' :
    		case 'A' :
    		case 'e' :
    		case 'E' :
    		case 'i' :
    		case 'I' :
    		case 'o' :
    		case 'O' :
    		case 'u' :
    		case 'U' :
    		i++;
    		}
    		if(i==1) {
    			System.out.println("Input letter is vowel.");
    		}
    		else if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
    			System.out.println("Input letter is consonant.");
    		}
    		else {
    			System.out.println("Error! Character is not from the alphabet.");	
    		}
    	}
        	  
 }

