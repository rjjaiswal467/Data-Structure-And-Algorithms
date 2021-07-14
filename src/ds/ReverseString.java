package ds;

public class ReverseString {
	
	private void reverse1() {
		StringBuffer str = new StringBuffer("Octane");
		str.reverse();
		System.out.println(str);

	}
	
	private void reverse2() {
		
		StringBuffer str = new StringBuffer("Wraith");
		System.out.println(str.reverse());
	}
	
	private void reverse3() {
		String input = "Lifeline";
		char[] input1 = input.toCharArray();
		
		for(int i = input1.length-1; i>=0; i--) {
			System.out.print(input1[i]);
		}

	}
		
	
		public static void main(String[] args) {
			
			ReverseString reverseString2 = new ReverseString();
			reverseString2.reverse1();
			reverseString2.reverse2();
			reverseString2.reverse3();
			
		}
}
