/* - Program to Read a string from the user and return Number of Vowels & Consonants -
Inform the user of the rules of the program
Create a scanner for the User given string and prompt user
Convert the user string to lowercase and assign to new variable
Intialize Vowel and Consonant integer variable to zero
For Loop for the length of the string to go through each character:
    Check if the character is a vowel:
        If so:
            Increment Vowel counter by one
    Else if check the character is a letter:
        If so:
            Increment Consonant counter by one
Return the Vowel and Consonant counts to the user
Close the scanner
*/

package part3;

// Import Libraries
import java.util.Scanner;

public class p08_vowel_cons {
    public static void main(String[] args) {
        // Inform user of rules of program
        System.out.println("- Please enter a String and I will return the Number of Vowels & Consonants -");

        // Scanner for User String
        Scanner userString = new Scanner(System.in);
        System.out.println("Enter Your String: ");
        String userWords = userString.nextLine();
        //System.out.println("Testing userWords: " + userWords);

        // Convert the User String to lowercase
        String lowWords = userWords.toLowerCase();
        //System.out.println("Testing lowWords: " + lowWords);

        // Intialize Vowel & Consonant Counter
        Integer vowelCount = 0;
        Integer consonCount = 0;
        
        // Loop to iterate over the lowercase string
        for (int i = 0; i < lowWords.length(); i++) {
            // Check if each character is a vowel
            if (lowWords.charAt(i) == 'a' || lowWords.charAt(i) == 'e' || lowWords.charAt(i) == 'i' || lowWords.charAt(i) == 'o' || lowWords.charAt(i) == 'u') {
                vowelCount++;
            } 
            // After checking for a vowel check if character is a letter
            else if (Character.isLetter(lowWords.charAt(i))) {
                consonCount++;
            }
        }

        // Return Vowel & Consonant counts to user
        System.out.println("Number of Vowels: " + vowelCount);
        System.out.println("Number of Consonants: " + consonCount);

        // Close Scanner
        userString.close();
    }
}
