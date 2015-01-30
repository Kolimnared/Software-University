package panels;
import java.awt.Color;
import java.awt.Font;

import game.*;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class StatsPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	private JLabel label;
	private JTextArea playersStats;
	
	public StatsPanel(Player playerOne, Player playerTwo){
		super();
		label = new JLabel(getTurn(playerOne, playerTwo));
		label.setFont(new Font("Times new roman", Font.PLAIN, 18));
		add(label);
		setBackground(Color.gray);
		setPlayersStats(new JTextArea(getStats(playerOne, playerTwo), 2, 24));
		add(playersStats);
	}

	public String getStats(Player playerOne, Player playerTwo){
		return playerOne.getName() + " : " + playerOne.getScore() + "\n" + 
				playerTwo.getName() + " : " + playerTwo.getScore();
	}
	
	public String getTurn(Player playerOne, Player playerTwo){
		if(playerOne.isTurn()){
			return playerOne.getName() + "'s Turn!";
		}
		return playerTwo.getName()  + "'s Turn!";
	}
	
	public void refresh(Player playerOne, Player playerTwo){
		label.setText(getTurn(playerOne, playerTwo));
		playersStats.setText(getStats(playerOne, playerTwo));
	}

	public void setPlayersStats(JTextArea playersStats) {
		this.playersStats = playersStats;
		this.playersStats.setEditable(false);
		this.playersStats.setFont(new Font("Times new roman", Font.PLAIN, 18));
	}
	
}
