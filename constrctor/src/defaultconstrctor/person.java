package defaultconstrctor;
import java.util.Scanner;
public class person extends vehicle{
	Scanner scn=new Scanner(System.in);
	private String name;
	private int age;
	private String vehicle;
	
	person(String name,int age){
		super();
		this.name=name;
		this.age=age;
		
	}
	
	public void displaydata() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		
	}
}
