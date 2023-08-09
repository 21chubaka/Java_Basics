package part1;

import java.util.Scanner;
import static java.lang.Math.*;

/* - Area & Volume Calculator - 
- Program to return the Area & Volume of the Cylinder, given a radius and length from user - 
area = pi * (radius)^2
volume = area * length
Prompt user for a radius and length
Create scanner objects for the user input of radius and length
Store user inputs into a radius and length variables
Check if the inputs are greater than zero:
  If so: calculate area and volume of cylinder and return to user
  If not: Inform user and end program
Close scanner objects
*/

public class p0_area_vol {
    public static void main(String[] args) {
        // Create a user radius Scanner
        System.out.println("Please enter Radius and Length of a Cylinder that is greater than zero, and I will return the Area & Volume of the Cylinder.");
        Scanner userRad = new Scanner(System.in);
        System.out.println("Enter Radius:");
        Double rad = userRad.nextDouble();
        
        // Create a user length Scanner
        Scanner userLength = new Scanner(System.in);
        System.out.println("Enter Length:");
        Double length = userLength.nextDouble();
        
        // Check if the user input is greater than zero
        if (rad > 0 & length > 0) {
          Double area = PI * (rad * rad);

          System.out.println("Area: " + area);
          System.out.println("Volume: " + area * length);
        } else {
          System.out.println("The Radius & Length must be greater than zero. Please try again.");
        }
        
        // Close Scanner objects
        userRad.close();
        userLength.close();
      }
}