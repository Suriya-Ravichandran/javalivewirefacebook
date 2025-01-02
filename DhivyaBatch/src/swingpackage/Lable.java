package swingpackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lable {

    public static void main(String[] args) {
        // Create JFrame (window)
        JFrame f = new JFrame("Login Page");
        
        // Create components: JLabel, JTextField, JPasswordField, JButton
        JLabel l1 = new JLabel("Enter Username:");
        JLabel l2 = new JLabel("Enter Password:");
        
        JTextField t1 = new JTextField();
        JPasswordField t2 = new JPasswordField();
        
        JButton b = new JButton("Login");
        
        // Set bounds for each component (position and size)
        l1.setBounds(50, 50, 150, 30);
        t1.setBounds(200, 50, 200, 30);
        
        l2.setBounds(50, 100, 150, 30);
        t2.setBounds(200, 100, 200, 30);
        
        b.setBounds(150, 150, 100, 30);
        
        // Add components to the frame
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);
        
        // Set frame properties
        f.setSize(500, 300);  // Adjusted size for better layout
        f.setLayout(null);     // Null layout for manual positioning
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Add action listener for the login button
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = t1.getText();
                String password = new String(t2.getPassword()); // Get the password
                
                // Basic validation (You can customize the logic here)
                if (username.equals("admin") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(f, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(f, "Invalid Username or Password");
                }
            }
        });
    }
}
