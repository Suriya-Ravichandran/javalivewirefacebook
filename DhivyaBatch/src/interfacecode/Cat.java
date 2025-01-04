package interfacecode;

public class Cat implements Animal{

	@Override
	public void animalsound() {
		System.out.println("Meow");
		
	}

	@Override
	public void sleep() {
		
		System.out.println("cat is slepping zzz!");
	}

}
