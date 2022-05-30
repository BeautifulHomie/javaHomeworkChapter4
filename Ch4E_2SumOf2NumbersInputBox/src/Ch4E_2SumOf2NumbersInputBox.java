import javax.swing.JOptionPane;

public class Ch4E_2SumOf2NumbersInputBox {

	public static void main(String[] args) {
		
		String strNum1, strNum2;
		double num1, num2, sum;
		
		strNum1 = JOptionPane.showInputDialog("Please enter a number:");
		num1 = Double.parseDouble(strNum1);
		
		strNum2 = JOptionPane.showInputDialog("Please enter another number:");
		num2 = Double.parseDouble(strNum2);
		
		sum = num1 + num2;
		
		System.out.println("The sum of the two numbers is " + sum);

	}

}
