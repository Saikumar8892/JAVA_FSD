package p02;

import java.util.Scanner;

public class VowelChecker {

	public static void amin(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		System.out.println("Enter the value of 'n': ");
		int n = scanner.nextInt();
		String lastNVowels = countLastNVowels(input, n);
		
		System.out.println("Last" + n + "vowels: " + lastNVowels);
	}
	
	public static String countLastNVowels(String input, int n) {
		int vowelCount = 0;
		StringBuilder lastNVowels = new StringBuilder();
		
		for(int i=input.length()-1; i>=0; i--){
		char ch = Character.toLowerCase(input.charAt(i));
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			vowelCount++;
			lastNVowels.insert(0, ch);
			
		}
		if(vowelCount == n) {
			break;
		}
	}
	if(vowelCount < n) {
		return "Mismatch in Vowel Count";
	} else {
		return lastNVowels.toString();
	}
}
}
