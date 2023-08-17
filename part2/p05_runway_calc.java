/* - Program to Return the Minimum Runway Length when Given Speed, Acceleration, and Condition (Wet or Dry) -
Inform the user of the rules of the program
Create scanners for speed, acceleration, and condition
Check if the condition is not valid
    If so:
        Inform the user of the mistake
    If not:
        Check if the condition is wet
            If so:
                Calculate the runway length with 15% increase
            If not:
                Calculate the runway length with dry conditions
Close the scanners for speed, acceleration, and condition
*/

package part2;

// Import Libraries
import java.util.Scanner;
import java.lang.Math.*;

public class p05_runway_calc {
    public static void main(String[] args) {
        // Inform user of rules of program
        System.out.println("Please enter Speed, Acceleration, and Condition (Wet or Dry).");
        System.out.println("Speed and Accelaration must be a number and Condition is 'W' or 'w for wet and 'D' or 'd' for dry.");

        // Scanner for Speed
        Scanner userSpeed = new Scanner(System.in);
        System.out.println("Enter Speed: ");
        Double v = userSpeed.nextDouble();

        // Scanner for Acceleration
        Scanner userAcc = new Scanner(System.in);
        System.out.println("Enter Acceleration: ");
        Double a = userAcc.nextDouble();

        // Scanner for Condition
        Scanner userCond = new Scanner(System.in);
        System.out.println("Enter Condition: ");
        Character condition = userCond.next().charAt(0);
        // System.out.println(condition);

        // Check if the condtion is not 'w' 'W' 'd' 'D'
        if (!(condition == 'w' || condition == 'W' || condition == 'd' || condition == 'D')) {
            // Error message
            System.out.println("The condition is not valid. It must be 'W' or 'w for wet and 'D' or 'd' for dry.");
        } else {
            // Check if condition is wet
            if ((condition == 'w') || (condition == 'W')) {
                // Calculate runway needed with wet cond
                Double runwayLength = ((v * v) / (2 * a)) * 1.15;

                System.out.println("- Given Conditions -");;
                System.out.println("Speed: " + v);
                System.out.println("Acceleraton: " + a);
                System.out.println("Weather Condition: Wet");
                System.out.println("-----------------------");
                System.out.println("Runway needed to takeoff: " + runwayLength);
            } else {
                // Calculate runway with dry cond
                Double runwayLength = ((v * v) / (2 * a));

                System.out.println("- Given Conditions -");;
                System.out.println("Speed: " + v);
                System.out.println("Acceleraton: " + a);
                System.out.println("Weather Condition: Dry");
                System.out.println("-----------------------");
                System.out.println("Runway needed to takeoff: " + runwayLength);
            }
        }

        // Close the scanners
        userSpeed.close();
        userAcc.close();
        userCond.close();
    }
}
