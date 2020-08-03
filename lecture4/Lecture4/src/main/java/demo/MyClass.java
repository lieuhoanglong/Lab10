package demo;

public class MyClass {

	public static int multiply(int a, int b) {
		int result=0;
		if (a<b) {
			for (int i=0; i<b; i++)
				result += a;
		}
		else {
			for (int i=0; i<a; i++)
				result += b;
		}
		return result;
	}
	
	public static float divide(int a, int b) {

		return a / b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%d * %d = %d", 3, 4, multiply(3,4));
		//divide(2,3);
	}

}
