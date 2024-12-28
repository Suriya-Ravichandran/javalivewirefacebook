package AbstractMethod;

public class Main extends Person{

	public static void main(String[] args) {
		Main m1=new Main();
		m1.sleep();
		m1.animalSound();

	}

	@Override
	public void animalSound() {
		System.out.println("hello");
		
	}

}
