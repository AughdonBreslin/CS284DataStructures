package stacks;

public class WellBalanced {
	// data fields
	private Stack<Character> s;
	private String str;
	// constants
	private static final String OPEN = "([{<";
	private static final String CLOSE= ")]}>";
	
	
	// Constructor
	WellBalanced(String s) {
		this.str=s;
	}
	
	
	// Methods
	
	public static Boolean isOpening(char ch) {
		return OPEN.indexOf(ch)!=-1;
	}

	public static Boolean isClosing(char ch) {
		return CLOSE.indexOf(ch)!=-1;
	}

	public Boolean isWellBalanced() {
		// complete
		return null;
	}
}
