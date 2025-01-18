package utilpackage;

import java.util.Random;
public class Randomnum {

	public static void main(String[] args) {
		Random r1 = new Random();
		System.out.println(r1.nextInt());
		System.out.println(r1.nextDouble());
		System.out.println(r1.nextBoolean());
	}

}
