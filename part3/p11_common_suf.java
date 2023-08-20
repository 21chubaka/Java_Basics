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

// Import Libraries
import java.util.Scanner;

public class p11_common_suf {
    public static void main(String[] args) {
        // Inform user of rules of program
        System.out.println("- Please enter Two Strings and I will return their Common Suffix -");

        // Scanner for User's First String
        Scanner userString1 = new Scanner(System.in);
        System.out.println("Enter Your First String: ");
        String str1 = userString1.nextLine();

        // Scanner for User's Second String
        Scanner userString2 = new Scanner(System.in);
        System.out.println("Enter Your Second String: ");
        String str2 = userString2.nextLine();

        // Intialize length variables for string one & two
        Integer lenStr1 = str1.length();
        Integer lenStr2 = str2.length();
        // Intialize empty string variables to hold reverse of string one & two
        String revStr1 = "";
        String revStr2 = "";
        // Intialize variable to hold min length of two strings
        Integer minLen;
        // Intialize empty string variable to hold suffix or no suffix return to user
        String suffix = "";

        // Check for the min length between string one and string two & assign to min length variable
        if (lenStr1 >= lenStr2) {
            minLen = lenStr2;
        } else {
            minLen = lenStr1;
        }
        //System.out.println("Min Length: " + minLen);

        // Loop to reverse the first string
        for (int i = 0; i < lenStr1; i++) {
            // Grabs each character
            Character letter = str1.charAt(i);
            // Add each character to the reversed string one variable
            revStr1 = letter + revStr1;
        }
        //System.out.println("Reversed Str1: " + revStr1);

        // Loop to reverse the second string
        for (int i = 0; i < lenStr2; i++) {
            // Grabs each character
            Character letter = str2.charAt(i);
            // Add each character to the reversed string two variable
            revStr2 = letter + revStr2;
        }
        //System.out.println("Reversed Str2: " + revStr2);

        // Check if first character of each reversed string variable is equal
        if (revStr1.charAt(0) == revStr2.charAt(0)) {
            // Loop through each character using min length
            for (int i = 0; i < minLen; i++) {
                // Grab each character at i
                Character revStr1Char = revStr1.charAt(i);
                Character revStr2Char = revStr2.charAt(i);
                //System.out.println(revStr1Char);
    
                // Check if each char i is equal to each other
                if (revStr1Char == revStr2Char) {
                    // Append equal char to suffix
                    suffix = suffix + revStr1Char;
                } else {
                    break;
                }
            }
        } else {
            // If first characters of reversed strings are not equal append no suffix to suffix variable
            suffix = "No Common Suffix";
        }

        // Return suffix or 'no common suffix' to user
        System.out.println(suffix);

        // Close scanners
        userString1.close();
        userString2.close();
    }
}
