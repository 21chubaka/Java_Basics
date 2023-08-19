/* - Program to Read a string from the user and return the string in Reverse -
Inform the user of the rules of the program
Create a scanner for the user given string
Intialize variable to hold a characters and the reversed string
Loop through the User String character by character:
    Grab the character are i and put into character variable
    Add the character to the reversed string variable
Return the reversed string variable to the User
Close the scanner
*/

package part3;

// Import Libraries
import java.util.Scanner;

public class p09_rev_str {
    public static void main(String[] args) {
        // Inform user of rules of program
        System.out.println("- Please enter a String and I will return your String in Reverse -");

        // Scanner for User String
        Scanner userString = new Scanner(System.in);
        System.out.println("Enter Your String: ");
        String userWords = userString.nextLine();
        //System.out.println("Testing userWords: " + userWords);

        // Intialize a letter variable and reversed string variable
        Character letter;
        String revString = "";

        // Loop through the string
        for (int i = 0; i < userWords.length(); i++) {
            // Grabs each character
            letter = userWords.charAt(i);
            // Add each character to the reversed string variable
            revString = letter + revString;
        }

        // Return the Reversed String to the User
        System.out.println("Your string in Reverse:");
        System.out.println(revString);

        // Close the scanner
        userString.close();
    }
}
