package project3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c1 =new Calculator();
		int twoarg=c1.add(10, 20);
		int threearg=c1.add(23,12,90);
		double differdatatype=c1.add(10.6, 24, 25);
		String value1=c1.add("Suriya", "Ravichandran");
		
		System.out.println("Two arg: "+twoarg);
		System.out.println("Three arg: "+threearg);
		System.out.println("Differarg: "+differdatatype);
		System.out.println("Stringarg: "+value1);

	}

}
