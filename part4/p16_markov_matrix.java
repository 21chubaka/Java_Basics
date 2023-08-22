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

// Import Libraries
import java.util.Random;
import java.util.Scanner;

public class p16_markov_matrix {
    public static void main(String[] args) {
        // Inform the user of the rules of the program
        System.out.println("If you provide an integer, I will tell make an array of n*n and tell you if it is a Markov Matrix.");

        // Scanner for User to say how many integers they will add
        Scanner userN = new Scanner(System.in);
        System.out.println("Enter your integer for the Matrix: ");

        if (userN.hasNextInt()) {
            Integer matrixNum = userN.nextInt();

            if (matrixNum > 0) {
                // Intialize empty array of with user given size n*n
                double[][] numArray = new double[matrixNum][matrixNum];

                // Create a random object
                Random random = new Random();

                for (int i = 0; i < matrixNum; i++) {
                    for (int j = 0; j < matrixNum; j++) {
                        double num = random.nextDouble();
                        //System.out.println("Row: " + i + " | Column: " + j);
                        //System.out.println("Random Num: " + num);
                        numArray[i][j] = num;
                    }
                }

                if ( isMarkovMatrix(numArray) == true ) {
                    System.out.println("It is a Markov Matrix.");
                } else {
                    System.out.println("It is not a Markov Matrix.");
                }
            } else {
                System.out.println("The Matrix size must be greater than zero.");
            }
        } else {
            System.out.println("Your input must be an integer that is greater than zero");
        }

        //Close the scanners
        userN.close();
    }
    // To check if the matrix is Markov
    public static boolean isMarkovMatrix(double[][] m) {
        boolean result = false;
        double totalSum = 0;

        for (int i = 0; i < m.length; i++) {
            double sum = 0;

            for (int j = 0; j < m.length; j++) {
                sum = sum + m[i][j];
            }
            totalSum = totalSum + sum;
        }
        if ((totalSum / m.length) == 1) {
            result = true;
        }
        return result;
    }
}
