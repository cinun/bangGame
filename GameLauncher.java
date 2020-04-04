import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  


public class GameLauncher extends JFrame{

	JPanel panelCont = new JPanel();
	JPanel menu = new JPanel();
	JPanel nop = new JPanel();
	JButton play  = new JButton();
	JButton start =new JButton();
	JButton back = new JButton();
	JLabel question;
	JComboBox numPlayers;

	CardLayout cl = new CardLayout();

	Gameplay game = new Gameplay();

	public GameLauncher(){
	
		panelCont.setLayout(cl);

		ImageIcon bgImg = new ImageIcon("bang.png");
		JLabel bg = new JLabel("",bgImg, JLabel.CENTER);
		bg.setBounds(0,0,1080,700);
		
		
		play.setIcon(new ImageIcon("play.png"));
		play.setBounds(645,495,260,70);
		play.setContentAreaFilled(false);
		play.setBorderPainted(false);

		bg.add(play);
		menu.add(bg);

		ImageIcon wall = new ImageIcon("bg.png");
		JLabel background = new JLabel("",wall, JLabel.CENTER);
		background.setBounds(0,0,1080,700);
		background.setLayout(new GridBagLayout());

		numPlayers = new JComboBox();
		numPlayers.addItem(2);
		numPlayers.addItem(3);
		numPlayers.addItem(4);
		numPlayers.addItem(5);
		numPlayers.addItem(6);
		numPlayers.addItem(7);
		numPlayers.setFont(new Font("Arial",Font.BOLD, 35));
		numPlayers.setPreferredSize(new Dimension(70,70));

		question = new JLabel("NUMBER OF BOTS ::");
		question.setFont(new Font("Arial",Font.BOLD, 70));
		question.setForeground(Color.BLACK);

		back.setIcon(new ImageIcon("back.png"));
		back.setContentAreaFilled(false);
		back.setBorderPainted(false);

		start.setIcon(new ImageIcon("start.png"));
		start.setContentAreaFilled(false);
		start.setBorderPainted(false);

		GridBagConstraints gbc = new GridBagConstraints();
 		gbc.insets = new Insets(30,30,30,30);

		gbc.gridx = 0;
 		gbc.gridy = 1;
		background.add(question, gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.CENTER;
		background.add(start, gbc);

		gbc.gridx = 0;
 		gbc.gridy = 0;
 		gbc.anchor = GridBagConstraints.NORTHWEST;
		background.add(back, gbc);

		gbc.gridx = 1;
 		gbc.gridy = 1;
 		gbc.anchor = GridBagConstraints.EAST;
		background.add(numPlayers, gbc);

		nop.add(background);


		panelCont.add(menu,"1");
		panelCont.add(nop,"2");
		panelCont.add(game,"3");

		cl.show(panelCont,"1");

		play.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					cl.show(panelCont,"2");
				}
		});

		back.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					cl.show(panelCont,"1");
				}
		});

		start.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					cl.show(panelCont,"3");
				}
		});


		add(panelCont);
		pack();
		setBounds(0,0,1080,700);
		setTitle("Bang Game");
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args){
		new GameLauncher();
		
	}
	
}