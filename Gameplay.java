import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gameplay extends JPanel{

	public Gameplay(){
		ImageIcon wall = new ImageIcon("bg.png");
		JLabel gameBg = new JLabel("",wall, JLabel.CENTER);
		gameBg.setBounds(0,0,1080,700);
		add(gameBg);

	}
	
}