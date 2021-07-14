package ds;

public class RecursionUsingArray {
	
	static int find(int array[],int len) {
		
		if(len<=0)
			return 0;
		
		return (find(array,len-1)+array[len-1]);
	}

	public static void main(String[] args) {
		
		int array[]= {1,2,3,4,5,6,7,8,9,10};
		
		int res = find(array,(array.length));
		
		System.out.println(res);
	}
}
