package Stacks;

public class PalindromeChecker {
	// data fields
	private Stack<Character> s;
	private String str;
	
	// Constructor
	PalindromeChecker(String s) {
		fillStack(s);
		this.str=s;
	}	
	
	private void fillStack(String str) {
		// consider using s.CharAt(i) to grab i-th char in s
		
		s = new Stack<>();
		for (int i=0; i<str.length();i++) {
			s.push(str.charAt(i));
		}

	}
	
	private String reverseString() {

		StringBuilder rs = new StringBuilder();
		
		while (!s.empty()) {
			rs.append(s.pop());
		}
		return rs.toString();
	}
	
	public Boolean isPalindrome() {
		return str.replaceAll("\\s","").equalsIgnoreCase(reverseString().replaceAll("\\s",""));
	}
	
	public static void main(String[] args) {
		// code to test your solution 
		// include examples and non-examples
		
		PalindromeChecker pc = new PalindromeChecker("kayaK");
		System.out.println(pc.isPalindrome());
		
		PalindromeChecker pc2 = new PalindromeChecker("kayaks");
		System.out.println(pc2.isPalindrome());
		
		PalindromeChecker pc3 = new PalindromeChecker("I  saw I was I");
		System.out.println(pc3.isPalindrome());
		
		
	}
}
