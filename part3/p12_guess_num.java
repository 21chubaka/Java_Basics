/* - Program to Generate a Random Number and compare Guesses from User -
 --- Write a program that randomly generates an integer between 0 and 100, inclusive. The 
program prompts the user to enter a number. Then the program tells the user whether the 
number is too low, too high or correct
-----
Inform the user of the rules of the program
Create a scanner for the user's guess
Create a Random Object (inspired from java T point: https://www.javatpoint.com/how-to-generate-random-number-in-java)
Use the Random Object to generate a random int number bet 0-100 (inclusive) and assign it to a number variable
Check if the guess is valid (bet 0-100 inclusive):
    If so:
        Check if the guess is not correct:
            If so:
                Check if the guess is larger than the number:
                    If so:
                        Return 'Too High'
                    If not:
                        Return 'Too Low'
            If not:
                Return 'Correct'
    If not:
        Return Error message
*/

package part3;

// Import Libraries
import java.util.Scanner;
import java.util.Random;

public class p12_guess_num {
    public static void main(String[] args) {
        // Inform the user of the rules of the program
        System.out.println("Guess a Number from 0-100.");
        System.out.println("Your Guess must be an Integer.");

        // Scanner for User Guess
        Scanner userGuess = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        Integer guess = userGuess.nextInt();

        // Create a Random Object
        // Random class inspired from java T point: https://www.javatpoint.com/how-to-generate-random-number-in-java
        Random random = new Random();
        // Intialize a random generated number variable with a bound of 101
        Integer num = random.nextInt(101);
        //System.out.println("Generated Number: " + num);

        // Check if the guesses number if in the range o-100 (inclusive)
        if (guess >= 0 && guess <= 100) {
            // Check if guess is not correct
            if (guess != num) {
                // Check if guess is larger than number
                if (guess > num) {
                    System.out.println("Too high.");
                } else {
                    System.out.println("Too low.");
                }
            } else {
                System.out.println("Correct");
            }
        } else {
            // Error message if guess is out of range
            System.out.println("Your guess of " + guess + " is not between 0 - 100.");
        }

        // Close the scanner
        userGuess.close();
    }
}
