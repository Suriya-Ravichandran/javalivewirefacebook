package network;

import java.io.*;  
import java.net.*;  
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Socket s;
		try {
			s = new Socket("localhost",6666);
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
			dout.writeUTF("Hello Server i am client");
			dout.flush();  
			dout.close();  
			s.close();  
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		 
	}

}
