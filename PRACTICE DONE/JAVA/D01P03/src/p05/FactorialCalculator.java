package p05;

import java.util.Scanner;

public class FactorialCalculator {

	private static int i;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		int factorial = 1;
		
		if(number<0) {
			System.out.println("factorial is not defined for negative numbers.");
		}else {
			for(int i=1; i<=number; i++);{
			factorial *= i;
		}
		System.out.println("Factorial of " + number +"is" + factorial);
	}
	}

}
