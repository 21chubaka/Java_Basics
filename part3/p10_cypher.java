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
    
}
