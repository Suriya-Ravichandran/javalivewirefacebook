package file;

import java.io.File;
import java.io.IOException;
public class Createafile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myfile=new File("D:\\java\\workspace\\batch1\\javalivewirefacebook\\NikhithaBatch\\myfiles\\newfile.txt");
		try {
			if(myfile.createNewFile()) {
				System.out.println("File created Sucessfully");
			}
			else {
				System.out.println("File creatation failed");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
