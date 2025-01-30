package thread;

public class T1 {
	public static void main(String[] args) {
		Square s1= new Square();
		Cricle c1 =new Cricle();
		
		
		s1.start();
		c1.start();		
	}
}
