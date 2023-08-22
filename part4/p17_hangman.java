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

public class p17_hangman {
    
}
