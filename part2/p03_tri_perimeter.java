/* - Triangle Perimeter Calculator -
Inform the user of the rules of the program
Setup up three scanners to take input from user
Assign the three inputs to a Double variable
Check if the the sides are suitable to create a triangle:
    If so:
        Calculate the perimeter and return to user
    If not:
        Inform the user of mistake
Close the scanners
*/

package part2;

// Import Libraries
import java.util.Scanner;
import java.lang.Math.*;

public class p03_tri_perimeter {
    public static void main(String[] args) {
        // Inform user of rules of program
        System.out.println("Please enter 3 side lengths of a triangle.");
        System.out.println("The sum of every pair of the lengths of two sides must greater than the length of the remaining side");

        // Scanner for Side One of Triangle
        Scanner userSide1 = new Scanner(System.in);
        System.out.println("Enter First Length: ");
        Double s1 = userSide1.nextDouble();

        // Scanner for Side Two of Triangle
        Scanner userSide2 = new Scanner(System.in);
        System.out.println("Enter First Length: ");
        Double s2 = userSide2.nextDouble();

        // Scanner for Side Three of Triangle
        Scanner userSide3 = new Scanner(System.in);
        System.out.println("Enter First Length: ");
        Double s3 = userSide3.nextDouble();

        // Variables for sum of pairs of sides of triangle
        Double s1s2 = s1 + s2;
        Double s1s3 = s1 + s3;
        Double s2s3 = s2 + s3;

        // Check is Side lengths are Valid - Each pair of two sides are bigger than the three length
        if ((s1s2 > s3) & (s1s3 > s2) & (s2s3 > s1)) {
            // Perimeter Calculation
            Double perm = s1 + s2 + s3;

            System.out.println("The Perimeter of the Triangle is " + perm);
        } else {
            // Error message to user
            System.out.println("The side lengths are invalid.");
            System.out.println("The sum of every pair of the lengths of two sides must greater than the length of the remaining side");
        }

        // Close Scanners
        userSide1.close();
        userSide2.close();
        userSide3.close();
    }
}
