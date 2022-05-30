import java.util.Scanner;

public class Ch4E_8QuadraticEquation {

	public static void main(String[] args) {
		
		int a, b, c;
		double root1, root2;
		
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.println("Please enter values to solve the quadratic equation");
		System.out.print("Enter the coefficient of A: ");
		
		a = keyboardIn.nextInt();
		
		if(a == 0) {
			System.out.println("Invalid, coefficient of \"A\" cannot equal \"0\"");
		}
		
		else {
			System.out.print("Enter the coefficient of B: ");
			b = keyboardIn.nextInt();
			
			System.out.print("Enter the coefficient of C: ");
			c = keyboardIn.nextInt();
            
			root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c))/ 2.0 * a;
            root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c))/ 2.0 * a;
            
            System.out.println("The first root is " + root1);
            System.out.println("The second root is " + root2);
            
		}
	}

}
