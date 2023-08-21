/* - Program to Inform User if an array of integers they provide has (at least) four consecutive integers with the same value -
 ---  Write the following method that tests whether an integer array contains (at least one 
instance of) four consecutive integers with the same value:
public static boolean isConsecutiveFour(int[] values)
Include a main method in your program. The main method should prompt the user to enter 
the number of integers to be read, read the integers from the console, invoke the method 
isConsecutiveFour, and display a suitable message to the console (e.g. "contains four 
consecutive integers" or "does not contain four consecutive integers").
-----
Main function:
    Inform the user of the rules of the program
    Create a scanner to ask user how larger the array will be
    Check if the user's input is an integer, if so:
        Store the size of the array in an array variable
        Check if the array size is greater or equal to zero, if so:
            Create a scanner to take the elements of the array from the user
            Loop to append the elements to the array
            Call isConsecutiveFour function passing the array into it:
                If it returns true:
                    Inform the user it has four consecutive integers
                Else:
                    Inform the user it does not have four consective integers
            Close the array element scanner
        Else:
            Inform the user the array must be greater or equal to zero
    Else:
        Inform the user that all inputs must be an integer
    Close the array size scanner
isSorted function:
    Create a boolean variable
    Check if the length of the array is 1 or 0:
        If so:
            Update boolean variable to true
    Else:
        Loop through the array checking is the elements increase inside
            If so:
                Update boolean variable to true
            If not:
                Update boolean variable to false
    Return boolean variable
*/

package part4;

// Import Libraries
import java.util.Scanner;
import java.util.Arrays;

public class p14_four_con_ints {
    public static void main(String[] args) {
        // Inform the user of the rules of the program
        System.out.println("If you provide an array of integers, I will tell you if the array has (at least) four consecutive integers of the same value.");
        System.out.println("The numbers you provide must be integers.");

        // Scanner for User to say how many integers they will add
        Scanner userNumElem = new Scanner(System.in);
        System.out.println("Enter how many Elements you are going to enter: ");

        if (userNumElem.hasNextInt()) {
            Integer numElem = userNumElem.nextInt();

            if (numElem >= 0) {
                // Intialize empty array of the sixe provided
                int[] numArray = new int[numElem];
                
                // Scanner for User to provide elements of array
                Scanner arrElem = new Scanner(System.in);
                System.out.println("Enter your Elements to the Array: ");

                // Loop to append elements to array
                for (int i = 0; i < numElem; i++) {
                    numArray[i] = arrElem.nextInt();

                }

                // Check if isSorted return true or false
                if ( isConsecutiveFour(numArray) == true ) {
                    System.out.println(Arrays.toString(numArray) + " contains four consecutive integers");
                } else {
                    System.out.println(Arrays.toString(numArray) + " does not contain four consecutive integers");
                }
                // Close the elements of th array scanner
                arrElem.close();
            } else {
                System.out.println("The array must greater or equal to zero.");
            }
        } else {
            System.out.println("All your inputs must be an integer.");
        }

        //Close the array size scanner
        userNumElem.close();
        
    }
    public static boolean isConsecutiveFour(int[] arr) {
        // Intialize boolean variable
        boolean result = false;
        // Check if length of the array is less than 4
        if ( arr.length < 4 ) {
            result = false;
        } else {
            // Loop through the array check if it is sorted (increasing order)
            for ( int i = 0; i+3 < arr.length; i++ ) {
                int firstCheck = arr[i];
                int secondCheck = arr[i + 1];
                int thirdCheck = arr[i + 2];
                int fourthCheck = arr[i + 3];

                if ( firstCheck == secondCheck && firstCheck == thirdCheck && firstCheck == fourthCheck ) {
                    result = true;
                } 
            }
            
        }
        return result;
    }
}
