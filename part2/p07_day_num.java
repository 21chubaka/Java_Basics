/* - Program to Return the days in a month given a Year and a month (Checks for Leap Year) -
Inform the user of the rules of the program
Create a scanner for the year from the user
Create a scanner for the month from the user
Calculate the divisblities of the year by 4, 100, and 400; and store in variables
Check if the year is greater or equal to zero and the month is between 1 - 12
    If so:
        Check if the year is a leap year (div 4 and not div 100) or (div by 4, 100 , & 400)
            If so:
                Check the case for the month and return the number of days in that month (leap year specific)
            If not:
                Check the case for the month and return the number of days in that month (non-leap year specific)
    If not:
        Inform the user of the error (month and/or year)
Close the scanners
*/

package part2;

// Import Libraries
import java.util.Scanner;

public class p07_day_num {
    public static void main(String[] args) {
        // Inform user of rules of program
        System.out.println("Please enter a Year and I will tell you that year's Chinese Zodiac Animal.");
        System.out.println("The year must be positive, numeric, and an integer.");

        // Scanner for Year
        Scanner userYear = new Scanner(System.in);
        System.out.println("Enter Year: ");
        Integer year = userYear.nextInt();

        // Check if the year is greater or equal to zero
        if (year >= 0) {
            // Calculate the remainder
            Integer zodiacAnimal = year % 12;

            // Check the cases for the remainder and return that animal to the user
            switch (zodiacAnimal) {
                case 0:
                    System.out.println(year + " is the year of the monkey.");
                    break;
                case 1:
                    System.out.println(year + " is the year of the rooster.");
                    break;
                case 2:
                    System.out.println(year + " is the year of the dog.");
                    break;
                case 3:
                    System.out.println(year + " is the year of the pig.");
                    break;
                case 4:
                    System.out.println(year + " is the year of the rat.");
                    break;
                case 5:
                    System.out.println(year + " is the year of the ox.");
                    break;
                case 6:
                    System.out.println(year + " is the year of the tiger.");
                    break;
                case 7:
                    System.out.println(year + " is the year of the rabbit.");
                    break;
                case 8:
                    System.out.println(year + " is the year of the dragon.");
                    break;
                case 9:
                    System.out.println(year + " is the year of the snake.");
                    break;
                case 10:
                    System.out.println(year + " is the year of the horse.");
                    break;
                case 11:
                    System.out.println(year + " is the year of the sheep.");
                    break;
            }
        } else {
            // Error message
            System.out.println("The year must be positive, numeric, and an integer.");
        }

        // Close the scanner
        userYear.close();
    }
}
