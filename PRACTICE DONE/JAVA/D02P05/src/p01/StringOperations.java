package p01;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();
		
		System.out.print("Length of the string: " + inputString.length());
		
		System.out.print("Uppercase string: " + inputString.toUpperCase());
		
		if(isPalindrome(inputString)) {
			System.out.println("it is a palindrome");
		}else {
			System.out.println("it is not a palindrome");
		}
		scanner.close();
	}
	public static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length()-1;
		
		while(left<right) {
			if(str.charAt(left)!= str.charAt(right)) {
				return false;
				
			}
			left++;
			right--;
		}
		return true;
	}
	
}
