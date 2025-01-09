package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class App {

	public static void main(String[] args) {
		JFrame f =new JFrame("MY NEW APP");
		JButton b1=new JButton("Login");
		JTextField t1=new JTextField();
		JPasswordField p1 = new JPasswordField();
		JLabel l1= new JLabel("User Name");
		JLabel l2= new JLabel("Password");
		
		
//		Events
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String username=t1.getText();
				String password=new String(p1.getPassword());
				String mypass="suriya@123";
				
				if(password.equals(mypass)) {
					f.setVisible(false);
					JOptionPane.showMessageDialog(f, "Login Successful!");
					
                } else {
                    JOptionPane.showMessageDialog(f, "Invalid Username or Password");
                }
				
			}
		});
		
//		set bound
		l1.setBounds(100,170,300,40);
		t1.setBounds(100,200,400,40);
		l2.setBounds(100,270,300,40);
		p1.setBounds(100,300,400,40);
		b1.setBounds(180,400,200,40);
		
		
		
//		set layouts
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(p1);
		f.add(b1);
		f.setSize(600, 600);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
