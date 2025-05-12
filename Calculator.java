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
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        
        System.out.print("Select an operation (1-4): ");
        int choice = scan.nextInt();
        
        System.out.println("Enter your first number:");
        int num1 = scan.nextInt();
        System.out.println("Enter your second number:");
        int num2 = scan.nextInt();
        
        switch(choice)
        {
            case 1:
                Addition(num1, num2);
                break;
            case 2:
                Subtraction(num1, num2);
                break;
            case 3:
                Multiplication(num1, num2);
                break;
            case 4:
                Division(num1, num2);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        
        scan.close();
    }
    
    public static void Addition(int num1, int num2)
    {
        System.out.println("Result: " + (num1 + num2));
    }
    
    public static void Subtraction(int num1, int num2)
    {
        System.out.println("Result: " + (num1 - num2));
    }
    
    public static void Multiplication(int num1, int num2)
    {
        System.out.println("Result: " + (num1 * num2));
    }
    
    public static void Division(int num1, int num2)
    {
        if (num2 != 0)
        {
            System.out.println("Result: " + ((double)num1 / num2));
        }
        else
        {
            System.out.println("Error: Cannot divide by zero!");
        }
    }
}
