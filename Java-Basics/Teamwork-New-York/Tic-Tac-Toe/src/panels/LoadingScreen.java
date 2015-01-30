package panels;

import game.Game;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
 
 
public class LoadingScreen extends JFrame {
        private static final long serialVersionUID = 1L;
        static JPanel loadingScreen =  new JPanel((LayoutManager) new FlowLayout(FlowLayout.LEFT));
        static JPanel playersMenu = new JPanel();
        public static JTextArea player1 = new JTextArea("Player 1: ");
        public static JTextArea player2 = new JTextArea("Player 2: ");
        public static JTextField playerOne = new JTextField("", 25);
        public static JTextField playerTwo = new JTextField("", 25);
        public static JButton startButton = new JButton();
    
        public LoadingScreen()  {
                super ("Loading... ");
                setSize(700,360);
                setResizable(false);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                setBackground(Color.black);
                BufferedImage ttt = null;
				try {
					ttt = ImageIO.read(new File(getClass().getResource("/graphics/images/logo.jpg").toURI()));
				} catch (IOException e) {
					e.printStackTrace();
				} catch (URISyntaxException e) {
					e.printStackTrace();
				}
                JLabel image = new JLabel(new ImageIcon(ttt));
                image.setBackground(Color.black);
                loadingScreen.setLayout(new GridLayout(0, 2, 0, 0));
                
                player1.setEnabled(false);
                player1.setBackground(Color.gray);
                player1.setFont(new Font("Times new roman", Font.PLAIN, 24));
                player2.setEnabled(false);
                player2.setBackground(Color.gray);
                player2.setFont(new Font("Times new roman", Font.PLAIN, 24));
                
                playersMenu.add(player1);
                playersMenu.add(playerOne);
                playersMenu.add(player2);
                playersMenu.add(playerTwo);
                playersMenu.setBackground(Color.gray);
                startButton.setBackground(Color.gray);
                startButton.setIcon(new ImageIcon(LoadingScreen.class.getResource("/graphics/buttons/StartButton.png")));
                startButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String playerOneStr = playerOne.getText();
						String playerTwoStr = playerTwo.getText();
						Game.getPlayerNames(playerOneStr, playerTwoStr);
						dispose();
						new Game();
					}
				});
                loadingScreen.setBackground(Color.black);
                playersMenu.add(startButton);
                loadingScreen.add(image);
                loadingScreen.add(playersMenu);
                add(loadingScreen);
                setVisible(true);
        }
}