package p09;

public class ReplaceSpaces {

	public static void main(String[] args) {
	String input = "Mr John Smith";
	String output = replacespaces(input);
	System.out.println("Output: " + output);
	}
	
	public static String replacespaces(String str) {
		int spaceCount = 0;
		for(char c: str.toCharArray()) {
			if(c == ' ') {
				spaceCount++;
			}
		}
		
		int newLength = str.length() + spaceCount * 2;
		char[] newString = new char[newLength];
		
		int index = newLength - 1;
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i)==' ') {
				newString[index--] = '0';
				newString[index--] = '2';
				newString[index--] = '%';
			}else {
				newString[index--] = str.charAt(i);
			}
		}
		return new String(newString);
	}

}
