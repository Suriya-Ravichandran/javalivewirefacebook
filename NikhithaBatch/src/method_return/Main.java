package method_return;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Return r1=new Return();
		System.out.println("Enter Your name: ");
		String name=scn.next();
		r1.setname(name);
		
		System.out.println("----------Student Detials------------");
		r1.getdata();

	}

}
