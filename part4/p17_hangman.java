/* - Program to play Hangman -
 ---    Write a program to play a game of hangman. The program should randomly select a 
word and prompt the user to guess one letter at a time, as shown in Figure 1. Initially, each 
letter in the word is displayed as an asterisk. When the user makes a correct guess, the actual 
letter (or letters, if the correctly guessed letter occurs more than once in the word) is then 
displayed. When the user guesses all the letters in the word, display the number of incorrect 
guesses and ask the user to enter 'y' (or 'Y') to play the game again, or any other character to 
exit.
-----
Main function:
    Title Printout
    Create scanner for User Input
    Create a string variable and assign it the value returned by calling getRandomWord
    Create and empty ArrayList to hold the User's Guesses
    Create an integer variable to hold number of guesses wrong
    Create a boolean variable to check if the user is right and intialize it to true
    Create a string variable to hold the Masked Word and assign it the value returned by calling getMaskedWord
    While The check right variable is true:
        Check if masked word contains '*', then:
            Ask the user to guess a letter
            Add the guess to the user guesses variable (first character of the user's input)
            Update the masked word variable to empty
            Check if the secret word contains the user's guess, then:
                nothing
            else:
                Increment number of guesses wrong by one
            Loop for the length of the secret word:
                Check if the user guesses array list contains the secret word at i, then:
                    Add the character of the secret word at index i to the masked word
                else:
                    Add '*' to masked word
        else:
            Update the check right variable to false (breaking while loop)
    Inform the user they won and return the number of wrong guesses
    Close the user input scanner
getRandomWord function:
    Intialize a string variable for a word
    Intialize a list of words to randomly choose
    Intialize a random index number
    Assign word are index to word variable
    return the word
getMaskedWord function:
    Intialize an empty string variable for a masked word
    Loop through the length of the word given:
        Add '*' to the masked word variable
    return the masked word
*/

package part4;

// Import Libraries
import java.util.ArrayList;
import java.util.Scanner;

public class p17_hangman {
    public static void main(String[] args) {
        System.out.println("Let's Play Hangman!");

        // Scanner for user input
        Scanner userInput = new Scanner(System.in);

        String secretWord = getRandomWord();
        //System.out.println("Secret Word: " + secretWord);

        // ArrayList inspired from W3Schools: https://www.w3schools.com/java/java_arraylist.asp
        ArrayList<Character> userGuesses = new ArrayList<Character>();
        //System.out.println(userGuesses);

        // Variable to track how many wrong guesses
        Integer numGuessesWrong = 0;
        // to break while loop if user is right
        boolean checkRight = true;

        // Call getMaskedWord to get '***' a masked word
        String maskedWord = getMaskedWord(secretWord);

        while (checkRight) {
            // Check if masked word still has '*'
            if (maskedWord.contains("*")) {

                //System.out.println("Number of Wrong Guesses: " + numGuessesWrong);
                System.out.print("Guess a letter [" + maskedWord + "] ");
                String userLetter = userInput.nextLine();
                userGuesses.add(userLetter.charAt(0));

                // Clear masked word
                maskedWord = "";
                //System.out.println(userGuesses);
                if (secretWord.contains(userLetter)) {

                } else {
                    // Increment if wrong guess
                    numGuessesWrong++;
                }
                
                // Loop to update masked word as guess right/wrong
                for (int i = 0; i < secretWord.length(); i ++) {
                    
                    //System.out.println("Track Guess: " + trackGuess);
                    if (userGuesses.contains(secretWord.charAt(i))) {
                        //System.out.print(secretWord.charAt(i));
                        maskedWord += Character.toString(secretWord.charAt(i));
                    } else {
                        //System.out.print("*");
                        maskedWord += "*";
                    }
                }
            } else {
                // if no '*' update boolean to break loop (cuz the user Won!)
                checkRight = false;
            }  
        }
        // Inform the user of their Victory and tell them how many times they were wrong
        System.out.println("You win! The word is " + secretWord + ". You missed " + numGuessesWrong + " times.");

        //Close the scanner
        userInput.close();
    }
    // To generate a random word from a list of words
    public static String getRandomWord() {
        String word;
        String[] words = {"hello", "world", "break", "zoo", "blast", "pumpernickel", "pineapple", "word", "space", "train", 
        "rocket", "carpet", "horse", "lose", "aircraft", "computer", "penguin", "strawberry", "library", "ocean", "floor", "skeleton", 
        "ghoul", "goodbye", "evening", "kiwi", "object", "field", "charismatic", "extrovert", "understand", "pneumonoultramicroscopicsilicovolcanoconiosis", "zombie",};
        int index = (int) (Math.random() * words.length);
        word = words[index].toLowerCase();
        return word;
    }
    // To generate the intial masked word
    public static String getMaskedWord(String word) {
        String maskWord = "";

        for (int i = 0; i < word.length(); i++) {
            maskWord = maskWord + "*";
        }
        return maskWord;
    }
}
