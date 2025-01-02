package swingpackage;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonSwing {

	public static void main(String[] args) {
		JFrame o=new JFrame("Alert App");
		 JButton b=new JButton("Click Here");  
		 b.setBounds(50,100,95,30);  
		 b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Hello Dhivya");
			}
			
		});
		o.add(b);
		o.setSize(400, 400);
		o.setLayout(null);		
		o.setVisible(true);
		o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
