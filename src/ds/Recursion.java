package ds;

public class Recursion {
	
	public static int fact1(int n) {
		
		return ((n==1)|| (n==0))?1:n*fact1(n-1);
	}
	
	public static int fact2(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		
		return fact2(n-1)*n ;
	}
	
	public static void main(String[] args) {
		
		int no=20;
		System.out.println(fact1(no));
		System.out.println(fact2(no));
	}

}
