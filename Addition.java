/**Operators = +, -, *, /, % (modulus) = remainder 
 * if we do 6/4, then it equals 1. Cast as double 6/4 = 1.5
 * c++
 * x++ means x = x + 1; (increment)
 * x-- means x = x - 1; (decrement)
 * 
 */
import java.util.Scanner; //enables user input
class Addition {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num1;
		int num2;
		int sum;
		System.out.print("Enter the first number: ");
		num1 = scan.nextInt();
		//System.out.print(num1);
		System.out.print("Enter the second number: ");
		num2 = scan.nextInt();
		sum = num1 + num2;
		System.out.println("The sum is: " + sum);
	}
}