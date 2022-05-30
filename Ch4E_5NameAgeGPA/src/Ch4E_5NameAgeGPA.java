import java.util.Scanner;

public class Ch4E_5NameAgeGPA {

	public static void main(String[] args) {
		
		String name;
		int age;
		double gpa;
		String output;
		
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("Please enter your name:");
		name = keyboardIn.nextLine();
		
		System.out.print("Please enter your age:");
		age = keyboardIn.nextInt();
		
		System.out.print("Please enter your GPA:");
		gpa = keyboardIn.nextDouble();
		
		output = String.format("Name:%10s\n", name);
		output += String.format("Age:%10d\n", age);
		output += String.format("GPA:%10.2f\n", gpa);
		
		System.out.println(output);
	}

}
