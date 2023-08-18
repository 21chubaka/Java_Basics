/* - Program to Return the Chinese Zodiac Animal given a Year -
Inform the user of the rules of the program
Create a scanner for the year from the user
Check if the year is greater or equal to zero
    If so:
        Calculate the remainder
        Check which remainder case it satisfies and return that animal to the user
    If not:
        Inform the user of the error
Close the scanner
*/

package part2;

import java.util.Scanner;

public class p06_chinese_zodiac {
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
