/* - Program to Inform User if an array of integers they provide is Sorted or Not -
 ---  Write the following method that returns true if an array of integers is sorted in ascending 
order: 
public static boolean isSorted(int[] arr)
Also include a main method in your program. The main method should prompt the user to 
enter the number of integers to be read, read the integers from the console, invoke the method 
isSorted, and display a suitable message to the console (e.g. “is sorted” or “is not sorted”).
-----
Main function:
    Inform the user of the rules of the program
    Create a scanner to ask user how large the array will be
    Check if the user's input is an integer, if so:
        Store the size of the array in an array variable
        Check if the array size is greater or equal to zero, if so:
            Create a scanner to take the elements of the array from the user
            Loop to append the elements to the array
            Call isSorted function passing the array into it:
                If it returns true:
                    Inform the user it is sorted
                Else:
                    Inform the user it is not sorted
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

public class p13_sorted_arr {
    public static void main(String[] args) {
        // Inform the user of the rules of the program
        System.out.println("If you provide an array of integers, I will tell you if the array is sorted or not.");
        System.out.println("The numbers you provide must be integers.");

        // Scanner for User to say how many integers they will add
        Scanner userNumElem = new Scanner(System.in);
        System.out.println("Enter how many Elements you are going to enter: ");

        if (userNumElem.hasNextInt()) {
            Integer numElem = userNumElem.nextInt();

            if (numElem >= 0) {
                // Intialize empty array of the size provided
                int[] numArray = new int[numElem];
                
                // Scanner for User to provide elements of array
                Scanner arrElem = new Scanner(System.in);
                System.out.println("Enter your Elements to the Array: ");

                // Loop to append elements to array
                for (int i = 0; i < numElem; i++) {
                    numArray[i] = arrElem.nextInt();

                }

                // Check if isSorted return true or false
                if ( isSorted(numArray) == true ) {
                    System.out.println(Arrays.toString(numArray) + " is sorted");
                } else {
                    System.out.println(Arrays.toString(numArray) + " is not sorted");
                }
                // Close the elements of the array scanner
                arrElem.close();
            } else {
                System.out.println("The array must greater or equal to zero.");
            }
        } else {
            System.out.println("All your inputs must be an integer.");
        }
        
        //Close the array scanner
        userNumElem.close();
        
    }
    public static boolean isSorted(int[] arr) {
        // Intialize boolean variable
        boolean result = false;
        // Check if length of the array is 1 or 0
        if ( arr.length == 1 || arr.length == 0 ) {
            result = true;
        } else {
            // Loop through the array check if it is sorted (increasing order)
            for ( int i = 0; i+1 < arr.length; i++ ) {
                if ( arr[i] <= arr[i + 1] ) {
                    result = true;
                } else {
                    result = false;
                }
            }
            
        }
        return result;
    }
}
