import javax.swing.JOptionPane;

public class Ch4E_7SquareCubeFourth {

	public static void main(String[] args) {
		
		String strNumber, output;
		double number, squared, cubed, fourth;
		
		strNumber = JOptionPane.showInputDialog("Please enter a number:");
		number = Double.parseDouble(strNumber);
		
		squared = Math.pow(number, 2);
		cubed = Math.pow(number, 3);
		fourth = Math.pow(number, 4);
		
		output = "The square of " + number + " is " + squared;
		output += " The cube of " + number + " is " + cubed;
		output += " and " + number + " to the fourth power is " + fourth;
				
		JOptionPane.showMessageDialog(null, output);

	}

}
