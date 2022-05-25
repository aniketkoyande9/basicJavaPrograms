package basicJavaPrograms;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		//Scanner object for capturing the user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		//Stored the entered value in variable
		int num = scanner.nextInt();
		//Called the user defined function fact
		//initializing the constants
		 int t1 = 0, t2 = 1;
		System.out.print("Upto " + num + ": ");
		//while loop to calculate fibonacci series upto n numbers
		while (t1<= num)
		{
		System.out.print(t1 + " + ");
		int sum = t1 + t2;
		t1 = t2;
		t2 = sum;
		}
		}
}
