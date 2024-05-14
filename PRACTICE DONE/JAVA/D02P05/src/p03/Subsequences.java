package p03;

import java.util.List;
import java.util.ArrayList;

public class Subsequences {

	public static void main(String[] args) {
		String input = "abc";
		List<String> subsequences = getSubsequences(input);
		
		System.out.println("Input: " + input);
		System.out.print("Output: ");
		for (String subsequence : subsequences) {
			System.out.println(subsequence);
		}

	}
	
	public static List<String> getSubsequences(String str){
		List<String> subsequences = new ArrayList<>();
		generateSubsequences(str, 0, "", subsequences);
		return subsequences;
	}
	
	private static void generateSubsequences(String str, int index, String current, List<String> subsequences) {
		if(index == str.length()) {
			subsequences.add(current);
			return;
		}
		
		generateSubsequences(str, index + 1, current + str.charAt(index), subsequences);
		
		generateSubsequences(str, index + 1, current, subsequences);
		
	}

}
