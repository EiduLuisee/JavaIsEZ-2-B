package Exercise_2;

import java.util.Scanner;

public class Act_2_9 {
    public static void main(String[] args) throws Exception {
    System.out.println("Determine whether the year is a leap year or not.");
    Scanner leapYear = new Scanner(System.in);
    
    char repeat;
    do{
    System.out.println("Enter a year: ");

        int year = leapYear.nextInt();
        boolean isLeapYear = false;
        if ((year % 400==0) || ((year %4==0) && (year % 100!=0)))
        {
            System.out.println(year + " is a leap year!");
        }
        else
        {
            System.out.println(year + " is not a leap year!");
        }
        System.out.println("Would you like to enter another year?\n (Y = Yes | Other key = No");
        repeat = leapYear.next().charAt(0);
      }
      while (repeat =='y'|| repeat =='Y');

    }
}
