package exepection;

public class Program1 {

	public static void main(String[] args) {
		int a=2;
		int b=0;
		try {
		int c=a/b;
		System.out.println(c);
		}catch(Exception e) {
			System.out.println("Anything divide by zero is Zero");
		}
		
	}

}
