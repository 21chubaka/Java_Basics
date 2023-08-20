/* - Program to Read two strings from the user and return the common suffix -
Inform user of rules of the program
Create scanners for the user's first & second strings
Intialize various variables:
    Length of string one
    Length of string two
    Empty string for reverse of string one
    Empty string for reverse of string two
    Variable for minimum length between string one and two
    Empty string for suffix for 'no suffix'
Check which string as a smaller length:
    Assign smaller length to the minimum length variable
For loop through string one, character by character:
    Reverse string and append it to reversed string one variable
For loop through string two, character by character:
    Reverse string and append it to reversed string two variable
Check if first character of reversed string one & two are equal:
    If so:
        Loop through character by character (using min length variable):
            Grab first character of reversed strings one & two
            Check if they two characters are equal:
                If so:
                    Append character to suffix variable
                Else:
                    Break loop
    If not:
        Append 'no common suffix' to suffix variable
Return the suffix variable to the user (will be suffix or 'no common suffix')
Close scanners
*/

package part3;

public class p11_common_suf {
    
}
