/* - Program to return the Row & Column of the largest Element in a Randomly Generated 2-D array -
 ---  Write the following method that returns the location of the largest element in a 2-D array. 
The return value is a 1-D array that contains two elements. These two elements indicate the 
row and column indices of the largest element in the 2-D array. 
public static int[] getMaxIndices(double[][] arr)
Write a test program that creates a 2-D array with elements set to randomly generated values 
in the interval [0, 10) and displays the largest value by invoking method getMaxIndices.
-----
Main function:
    Create a random object
    Create two int variables for rows and cols:
        Use random to generate the numbers
    Intialize an empty array with the row and col variables
    Nested loop using i and row variable for first loop and  j and col variable for nested loop:
        Use random to generate random numbers (0-10)
        Append number to empty array
    Intialize variable to hold the return of getMaxIndices
    Intialize a variable to hold the max value of the array
    Return the Indice of the Max Value
    Return the Max Value
getMaxIndices function:
    Intialize a variable for the Index of the Max Value
    Intialize a variable for the Max Value and assign it the value located at [0][0]
    Nested loop using i and the length of the array for first loop and  j and the length of the array for nested loop:
        Check if Max Value is less than Value at [i][j]:
            If so:
                Update the Max Value with the Value at [i][j]
                Update Index of Max Value with [i] & [j]
    Return the Index of the Max Value
*/

package part4;

public class p15_maxVal_2dArr {
    
}
