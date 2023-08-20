/* - Program to Read a string from the user and return a cypher string -
--- Write a program to create a simple cypher. The program should read a string from the 
console and replace every lowercase letter in the string with the previous lowercase letter in 
the alphabet. For example, 'b' should be replaced with 'a', 'c' with 'b', etc. and the letter 'a' 
should be replaced with 'z'. Display the cypher to the console
---
Inform the user of the rules of the program
Create a scanner for the user string
Intialize a letter variable, a return cypher variable, and a string of the alphabet
Loop through the user string character by character:
    Check if the character if Uppercase or Not a letter:
        If so:
            Append it to the return cypher
        If not:
            Intialize a variable with the index of the character from the alphabet
            Check if the character is 'a':
                If so:
                    Append 'z' to the return cypher
                If not:
                    Intialize a variable with the index of the character from the alphabet minus One
                    Intialize a variable that holds the letter from the alphabet from the index just intialized
                    Append that letter to the return cypher
Return the Cyphered message to the user
Close the scanner
*/

package part3;

// Import Libraries
import java.util.Scanner;

public class p10_cypher {
    public static void main(String[] args) {
        // Inform user of rules of program
        System.out.println("- Please enter a String and I will return a String Cyphered -");

        // Scanner for User String
        Scanner userString = new Scanner(System.in);
        System.out.println("Enter Your String: ");
        String userCypher = userString.nextLine();

        // Intialize a character variable, return Cypher string variable, and a string of the alphabet
        Character letter;
        String retCypher = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        // Loop through the user string
        for (int i = 0; i < userCypher.length(); i++) {
            // Grabs each character
            letter = userCypher.charAt(i);

            // Check if the character is Upper case or is Not a Letter
            if (Character.isUpperCase(letter) || Character.isLetter(letter) == false) {
                // Add the character unchanged to the return cypher
                retCypher = retCypher + letter;
            } else {
                // Find the index of the letter from the alphabet string
                int idxLetter = alphabet.indexOf(letter);
                //System.out.println(idxLetter);

                // Check if the letter is 'a'
                if (letter == 'a') {
                    // Add 'z' to the return cypher
                    retCypher = retCypher + 'z';
                } else {
                    // Grab the index of the previous letter of the alphabet
                    int lastIdxLetter = idxLetter - 1;
                    // Intialize a character variable with the previous letter of the alphabet
                    Character lastLetter = alphabet.charAt(lastIdxLetter);

                    // Add the previous letter to the return cypher
                    retCypher = retCypher + lastLetter;
                }
            }
        }

        // Return the cyphered message to the user
        System.out.println("-- Cyphered Message --");
        System.out.println(retCypher);

        // Close the scanner
        userString.close();
    }
}
