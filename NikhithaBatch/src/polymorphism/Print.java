package polymorphism;

public class Print extends Println {

		
		public void print(int args) {
			System.out.print(args);
		}
		
		public void print(String args) {
			System.out.print(args);
		}

		@Override
		void println(int args) {
			// TODO Auto-generated method stub
			System.out.println(args);
			
		}

		@Override
		void println(String args) {
			// TODO Auto-generated method stub
			System.out.println(args);
			
		}

}
