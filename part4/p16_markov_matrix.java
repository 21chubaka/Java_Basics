/* - Program to return the Row & Column of the largest Element in a Randomly Generated 2-D array -
 ---   An n×n matrix (i.e. a 2-D table with n rows and n columns) is called a positive Markov 
matrix if each element is positive and the sum of the elements in each column is 1. Write the 
following method to check whether a matrix is a Markov matrix.
public static boolean isMarkovMatrix(double[][] m)
Also include a main method in your program. The main method should prompt the user to 
enter the value of n, create an n × n matrix with elements set to randomly generated values 
in the interval [0,1), invoke the method isMarkovMatrix and display a suitable message to 
the console
-----
Main function:
    Inform the user of the rules
    Create a scanner for the user's n (for the matrix)
    Check if the user's input is an integer, if so:
        Store the user's input to a matrix variable
        Check if the matrix variable is greater than zero:
            If so:
                Intialize an empty array with the user given size (n*n)
                Create a random object
                Nested loop using i and matrix size for first loop and  j and matrix size for nested loop:
                    Use random to generate random double numbers
                    Append number to empty array
                Check if isMarkovMatrix is true:
                    If so:
                        Inform the user it is a Markov Matrix
                Else:
                    Inform the user it is a Markov Matrix
        Else:
            Inform the user the matrix must be greater than zero
    Else:
        Inform the user their input must be an integer and greater than zero
    Close the scanner
isMarkovMatrix function:
    Create a boolean result variable
    Intialize a double total sum variable to 0
    Nested loop to loop through columns:
        First loop (i), intialize sum variable
            Second loop (j), increment a sum to first loop sum (m[i][j])
        Increment sum to total sum
    Check if the total sum divided by the length of m is equal to 1:
        If so:
            Update result to true
    Return result
*/

package part4;

public class p16_markov_matrix {
    
}
