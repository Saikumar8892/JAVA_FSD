package p07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchPattern {

	public static void main(String[] args) {
		String[] dictionary = {"abb", "abc", "xyz", "xyy", "foo"};
        String pattern = "foo";
        List<String> matches = findMatches(dictionary, pattern);
        System.out.println("Output: ");
        for (String match : matches) {
        	System.out.println(match);
        }
	}
	
	public static List<String>findMatches(String[] dictionary, String pattern){
		List<String>matches = new ArrayList<>();
		String patterncode = generatePatternCode(pattern);
		
		for(String word : dictionary) {
			if(generatePatternCode(word).equals(patterncode)) {
				matches.add(word);
			}
		}
		return matches;
	}
	
	public static String generatePatternCode(String word) {
		Map<Character, Integer> charMap = new HashMap<>();
		StringBuilder patternCode = new StringBuilder();
		int counter = 0;
		
		for (char c:word.toCharArray()) {
			charMap.putIfAbsent(c, counter++);
			patternCode.append(charMap.get(c));
		}
		return patternCode.toString();
	}

}
