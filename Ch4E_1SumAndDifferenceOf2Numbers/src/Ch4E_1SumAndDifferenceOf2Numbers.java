import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ch4E_1SumAndDifferenceOf2Numbers {

	public static void main(String[] args) {
		
		int num1, num2, sum, diff;                          

        Scanner KeyboardIn = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        num1 = KeyboardIn.nextInt();

        System.out.print("Please enter the second number: ");
        num2 = KeyboardIn.nextInt();

        sum = num1 + num2;
        diff = num1 - num2;

        System.out.println(num1 + " + " + num2  + " = " + sum + " and " + diff + " is the difference.");
       
	}

}
