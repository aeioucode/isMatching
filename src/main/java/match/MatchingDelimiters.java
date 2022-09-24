package match;


public class MatchingDelimiters {
	
	public static boolean isMatched(String exp) {
		final String opening = "({[";
		final String closing = ")}]";
		
		Stackk<Character> buffer = new LinkedStack<Character>();
		
		for(char c : exp.toCharArray()) {
			if(opening.indexOf(c) != -1)
				buffer.push(c);
			else if(closing.indexOf(c) != -1) {
				if(buffer.isEmpty())
					return false;
				if(closing.indexOf(c) != opening.indexOf(buffer.pop()))
					return false;
			}
		}
		return buffer.isEmpty();
	}
}
