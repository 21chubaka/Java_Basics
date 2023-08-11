import java.util.Scanner;
import java.lang.Math.*;

public class p02_x_y_distance {
    public static void main(String[] args) {
        Scanner userX1 = new Scanner(System.in);
        System.out.println("Enter First Point's X (x1): ");
        Double x1 = userX1.nextDouble();

        Scanner userY1 = new Scanner(System.in);
        System.out.println("Enter First Point's Y (y1): ");
        Double y1 = userY1.nextDouble();

        Scanner userX2 = new Scanner(System.in);
        System.out.println("Enter Second Point's X (x2): ");
        Double x2 = userX2.nextDouble();

        Scanner userY2 = new Scanner(System.in);
        System.out.println("Enter Second Point's Y (y1): ");
        Double y2 = userY2.nextDouble();

        Double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println("The Distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is:");
        System.out.println(distance);

        userX1.close();
        userY1.close();
        userX2.close();
        userY2.close();
    }
}
