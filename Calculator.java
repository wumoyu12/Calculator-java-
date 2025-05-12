//Title: Activity - Calculator
//Author: Moyu Wu
//Start Date: May 12, 2025
//End Date: May 13, 2025
//Description: This program will ask users to choose the operators and input two numbers they want to calculate and the program will display the answer.

package Activity;
import java.util.Scanner;

public class Calculator
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the JAVA Calculator");
		System.out.println("------------------------------");
		System.out.println("1 - Addition");
		System.out.println("2 - Subtraction");
		System.out.println("3 - Multipcation");
		System.out.println("4 - Divsion");
		int num1, num2;
		System.out.println("Enter your first number:");
		num1 = scan.nextInt();
		System.out.println("Enter your second number:");
		num1 = scan.nextInt();
		
		Addition(num1, num2);
		Subtraction(num1, num2);
		Multipcation(num1, num2);
		Divsion(num1, num2);
	}

}
