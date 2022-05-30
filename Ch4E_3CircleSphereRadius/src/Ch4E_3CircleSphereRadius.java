import java.util.Scanner;

public class Ch4E_3CircleSphereRadius {

	public static void main(String[] args) {
	
		Scanner keyboardIn = new Scanner(System.in);
		double radius;
		
		System.out.print("Please enter a radius: ");
		radius = keyboardIn.nextDouble();
		
		System.out.printf("The area of the circle is: %17.2f\n", (Math.PI * Math.pow(radius, 2)));
		System.out.printf("The circumference of the circle is: %8.2f\n", (2 * Math.PI * radius));
		System.out.printf("The volume of the sphere is: %15.2f\n", (4.0/3.0 * Math.PI * Math.pow(radius, 3)));
		System.out.printf("The surface area of the sphere is: %9.2f\n", (4.0 * Math.PI * Math.pow(radius, 2)));
	}

}
