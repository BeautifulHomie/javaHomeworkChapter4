import javax.swing.JOptionPane;

public class Ch4E_6InputboxFullName {

	public static void main(String[] args) {
		
		String fullName;
		int spaceLocation;

		fullName = JOptionPane.showInputDialog("Please enter your full name");
		
		spaceLocation = fullName.indexOf(" ");
		String firstName = fullName.substring(0, spaceLocation);
		String lastName = fullName.substring(spaceLocation + 1);
		
		System.out.println("Hello " + firstName + " your last name is " + lastName);

	}

}
