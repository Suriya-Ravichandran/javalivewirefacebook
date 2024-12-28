package exceptionhanding.com;

public class Arrayboundoferror {

	public static void main(String[] args) {
		try {
		int [] num= {10,20,30};
		System.out.println(num [4]);
		} catch(Exception e) {
//			System.out.println();
		}
		finally {
			System.out.println(0);
		}

	}

}
