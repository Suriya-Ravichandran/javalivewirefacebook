package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CreateWindow {

	public static void main(String[] args) {
//		object creation
		JFrame f=new JFrame("First Application");
		JButton b1=new JButton("login");
		JTextField t1=new JTextField();
		JPasswordField p2=new JPasswordField();
		JLabel l1=new JLabel("Enter username"); 
		JLabel l2=new JLabel("Enter Password");
//		b1.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showMessageDialog(null, "Hello suriya");
//				
//				
//			}
//			
//		});
		
//		bounds area
		l1.setBounds(40,50,300,40);
		l2.setBounds(40,130,300,40);
		b1.setBounds(40,200,80,40);
		t1.setBounds(40,80,300,40);
		p2.setBounds(40,160,300,40);
		
		
// 		set a application
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(p2);
		f.add(b1);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
