import java.util.Scanner;

public class Ch4E_4LengthOfRectangleSides {

	public static void main(String[] args) {
		
		Scanner keyboardIn = new Scanner(System.in);
		double length1, length2;
		
		System.out.println("Please enter the measurement for the longer sides of a rectangle: ");
		length1 = keyboardIn.nextDouble();
		
		System.out.println("Please enter the measurement of the shorter sides of a rectangle: ");
		length2 = keyboardIn.nextDouble();
		
		System.out.printf("The area of the recangle is: %11.2f\n", (length1 * length2));
		System.out.printf("The perimeter of the recangle is: %5.2f\n", (Math.pow(length1, 2) + Math.pow(length2, 2)));
		System.out.printf("The diagonal of the rectangle is: %6.2f\n", (Math.sqrt(Math.pow(length1, 2) + Math.pow(length2, 2))));
	}

}
