package part1;
/* - Future Population Calculator - 
- Program to take a user given number of years and return the population after that number of years
The program assumes the current population is 312,032,486 and that a year is 365 days
Prompt user for a number of years
Intialize current population variable
Create scanner objects for the user input of num of yrs
Check if the inputs are greater than zero:
  If so: calculate future population and return to user
  If not: Inform user and end program
Close scanner objects
*/

import java.util.Scanner;

public class p01_pop_calc {
    public static void main(String[] args) {

        Double curPop = 312032486.00;
        
        Scanner userYears = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Years:");
        Double amtYears = userYears.nextDouble();  // Read user input

        if (amtYears > 0) {
            Double amtYearsSec = (((amtYears / 365.00) / 24) / 60);
            Double addPop = (amtYearsSec / 7) - (amtYearsSec / 13) + (amtYearsSec / 45);
            Double newPop = addPop + curPop;

            System.out.println("Population after " + amtYears + " years: " + newPop);
        } else {
            System.out.println("The Amount of Years must be greater than zero. Please try again.");
        }
        

        userYears.close();
    }
}
