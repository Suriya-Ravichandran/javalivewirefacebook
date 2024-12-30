package inheritSwing;

import javax.swing.*;

public class FrameClass extends JFrame{
	public FrameClass() {
		super("Inherit Demo");
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
