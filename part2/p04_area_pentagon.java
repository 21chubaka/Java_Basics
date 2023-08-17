/* - Program to Return the Area of the Pentagon when Given the Length from the Center of a Pentagon to a Vertex -
Inform the user of the rules of the program
Create scanner for the length
Check if the length is greater than zero
    If so:
        Calculation the are and return it to the user
    If not:
        Inform the user of the error
Close the scanner
*/

package part2;

// Import libs
import java.util.Scanner;
import java.lang.Math.*;

public class p04_area_pentagon {
    public static void main(String[] args) {
        // Inform user of rules of program
        System.out.println("Please enter the length from the center of a pentagon to a vertex.");
        System.out.println("The length must numeric and be greater than zero.");

        // Scanner for the length
        Scanner userR = new Scanner(System.in);
        System.out.println("Enter Length: ");
        Double r = userR.nextDouble();

        // Check if the length is greater than zero
        if (r > 0) {
            //Calculations for Area
            Double a = Math.PI / 5;
            Double s = 2 * r * Math.sin(a);

            Double aTop = 5 * (s * s);
            Double aBot = 4 * Math.tan(a);

            Double area = aTop / aBot;

            System.out.println("The Area of the Pentagon is " + area);
        } else {
            // Error message
            System.out.println("The length you provided is invalid.");
            System.out.println("The length must be greater than zero.");
        }

        //Close scanner
        userR.close();
    }
}
