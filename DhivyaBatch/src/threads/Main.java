package threads;

public class Main {

	public static void main(String[] args) {
		SingleThread s1 =new SingleThread();
		SingleThread s2 =new SingleThread();
		
		s1.start();
		s2.start();
	    System.out.println("This code is outside of the thread");
	    s1.run();
		s2.run();
	}

}

