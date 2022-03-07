package parser;

public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}
	public static double lexemeToReal(String str) {
		try {
			return Double.parseDouble(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}
	public static char lexemeToChar(String str) {
		try {
			char[] chars = str.toCharArray();
			if(chars[1] == '\\'){
				if(chars[2] == 'n') {
					return '\n';
				}
				if(chars[2] == 't') {
					return '\n';
				}
				else {
					return (char) Character.getNumericValue(Integer.parseInt(str.substring(2, str.length()-1)));
				}
			}

			return chars[1];
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return ' ';
	}

	
}
