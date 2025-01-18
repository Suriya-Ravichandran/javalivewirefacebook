package utilpackage;

import java.util.HashMap;
import java.util.Scanner;


public class Hashamapclass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		HashMap <Integer,String> hm1 = new HashMap<>();
		
		for(int i=0;i<=5;i++) {
			
			System.out.println("Enter the key: ");
			int key=scn.nextInt();
			System.out.println("Enter the Value: ");
			String value=scn.next();
			hm1.put(key,value);
			
		}
		
		System.out.println(hm1);
		scn.close();

	}

}
