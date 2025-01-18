package file;

import java.io.FileWriter;
import java.io.IOException;
public class Writeafile {

	public static void main(String[] args) {
		try {
			FileWriter writefile = new FileWriter("D:\\\\java\\\\workspace\\\\batch1\\\\javalivewirefacebook\\\\NikhithaBatch\\\\myfiles\\\\newfile.txt");
			writefile.write("Hello I am Java Developer");
			writefile.close();
			System.out.println("File write opreation success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
