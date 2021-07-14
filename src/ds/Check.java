package ds;

public class Check {
	public static void main(String[] args) {

//	char character = '0';  
//	int ascii = (int) character;
//	System.out.println(ascii);//48
		int res = 0;
		String str = "01234554848";
		char[] input = str.toCharArray();
		for (int i = 0; i < input.length; i++) {
			int ascii = (int) input[i];
			ascii = ascii - 48;
			res = (int) ((Math.pow(10, (input.length - 1 - i)) * ascii) + res);
		}
		System.out.println(res);
	}
}
