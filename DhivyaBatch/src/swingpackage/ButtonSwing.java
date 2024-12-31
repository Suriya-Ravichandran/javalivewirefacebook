package swingpackage;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonSwing {

	public static void main(String[] args) {
		JFrame o=new JFrame("Alert App");
		JButton btn=new JButton("Click me");
		btn.setPreferredSize(new Dimension(100,40));
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Hello Dhivya");
			}
			
		});
		o.add(btn);
		o.setSize(300, 300);
		o.setVisible(true);
		o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
