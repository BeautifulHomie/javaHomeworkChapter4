import java.util.Scanner;

public class Ch4E_9MetersConverter {

	public static void main(String[] args) {

		 final double METERS_PER_MILE = 1609.344;
		 final double METERS_PER_FEET = 0.3048;
		 final double METERS_PER_INCH = 0.0254;
		 
		 double meters;

		 Scanner keyboardIn = new Scanner(System.in);
		 
		 System.out.print("Please enter a distance in meters: ");
		 meters = keyboardIn.nextDouble();

		 System.out.printf("Amount of miles: %10.2f\n", meters / METERS_PER_MILE);
		 System.out.printf("Amount of feet: %11.2f\n", meters / METERS_PER_FEET);
		 System.out.printf("Amount of inches: %9.2f\n", meters / METERS_PER_INCH);

	}

}
