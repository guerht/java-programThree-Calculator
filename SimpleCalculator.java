// SimpleCalculator.java
// Assignment
import java.util.Scanner;
/*public*/ class SimpleCalculator {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		double num1;
		double num2;
		double choice;
		double total;
		System.out.println("This is a calculator. Choose an option and type the number: \n1.Addition\n2.Subtraction\n3.Multiplication\n4.Divisioin\n5.Modulus");
		choice = scan.nextInt();
		if (choice == 1) {
			System.out.print("Enter the first number: ");
			num1 = scan.nextInt();
			//System.out.print(num1);
			System.out.print("Enter the second number: ");
			num2 = scan.nextInt();
			total = num1 + num2;
			System.out.println("The ans is: " + total);
		}
		else if (choice == 2) {
			System.out.print("Enter the first number: ");
			num1 = scan.nextInt();
			//System.out.print(num1);
			System.out.print("Enter the second number: ");
			num2 = scan.nextInt();
			total = num1 - num2;
			System.out.println("The answer is: " + total);
		}
		else if (choice == 3) {
			System.out.print("Enter the first number: ");
			num1 = scan.nextInt();
			//System.out.print(num1);
			System.out.print("Enter the second number: ");
			num2 = scan.nextInt();
			total = num1 * num2;
			System.out.println("The answer is: " + total);
		}
		else if (choice == 4) {
			System.out.print("Enter the first number: ");
			num1 = scan.nextInt();
			//System.out.print(num1);
			System.out.print("Enter the second number: ");
			num2 = scan.nextInt();
			total = num1 / num2;
			System.out.println("The answer is: " + total);
		}
		else if (choice == 5) {
			System.out.print("Enter the first number: ");
			num1 = scan.nextInt();
			//System.out.print(num1);
			System.out.print("Enter the second number: ");
			num2 = scan.nextInt();
			total = num1 % num2;
			System.out.println("The answer is: " + total);
		}
		else {
			System.out.println("ERROR");
		}
	}
}