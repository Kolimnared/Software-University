package panels;
import game.Game;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class XOButton extends JButton implements ActionListener{
	private static final long serialVersionUID = 1L;
	private ImageIcon x;
	private ImageIcon o;
	private ImageIcon xWinner;
	private ImageIcon oWinner;
	private ImageIcon emptyCell;
	private int value;
/*	0 = empty;
	1 = X;
	2 = O;*/
	
	public XOButton(){
		this.x = new ImageIcon(this.getClass().getResource("/graphics/buttons/XIcon.jpg"));
		this.xWinner = new ImageIcon(this.getClass().getResource("/graphics/buttons/XIconWin.jpg"));
		this.o = new ImageIcon(this.getClass().getResource("/graphics/buttons/OIcon.jpg"));
		this.oWinner = new ImageIcon(this.getClass().getResource("/graphics/buttons/OIconWin.jpg"));
		this.emptyCell = new ImageIcon(this.getClass().getResource("/graphics/buttons/EmptyIcon.jpg"));
		setBackground(Color.white);
		this.setValue(0);
		this.setIcon(emptyCell);
		this.addActionListener(this);
		
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public boolean isEmpty(){
		if(this.value == 0)
			return true;
		return false;
	}
	
	public void resetImage(){
		this.setIcon(emptyCell);
	}
	
	public void setWinningIcon(){
		if(this.value == 1){
			this.setIcon(xWinner);
		}else{
			this.setIcon(oWinner);
		}
	}
	
	public void switchIcons(){
		ImageIcon temp = this.x;
		this.x = this.o;
		this.o = temp;
		
		temp = this.xWinner;
		this.xWinner = this.oWinner;
		this.oWinner = temp;
	}
	
	public void actionPerformed(ActionEvent e) {
		boolean winner = false;
		if(this.isEmpty()){
			if(Game.playerOne.isTurn()){
				this.setIcon(x);
				this.setValue(1);
				if(GridPanel.gotWinner(1)){
					Game.playerOne.setScore(Game.playerOne.getScore() + 1);
					winner = true;
				}
			}else{
				this.setIcon(o);
				this.setValue(2);
				if(GridPanel.gotWinner(2)){
					Game.playerTwo.setScore(Game.playerTwo.getScore() + 1);
					winner = true;
				}
			}
			
			if(winner){
				JOptionPane.showMessageDialog(new JFrame(), "Winner: " + (Game.playerOne.isTurn() == true ? Game.playerOne.getName() : Game.playerTwo.getName()));
				Game.restartGame();
				return;
			}else if(GridPanel.isGridFull()){
				JOptionPane.showMessageDialog(new JFrame(), "Draw!!!");
				Game.restartGame();
				return;
			}
			Game.switchTurns();
			MainPanel.getStatsPanel().refresh(Game.playerOne, Game.playerTwo);
		}
		
	}
	
}