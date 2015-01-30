package panels;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;


public class GridPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private static XOButton[][] buttons = new XOButton[3][3];
	
	public GridPanel(){
	//	super();
		setLayout(new GridLayout(3, 3, 12, 12));
		setBackground(Color.black);
		for (int i = 0; i < 9; i++) {
			buttons[i/3][i%3] = new XOButton();
			add(buttons[i/3][i%3]);
		}
	}
	
	public static boolean gotWinner(int value){
		if(buttons[0][0].getValue() == value && buttons[0][1].getValue() == value && buttons[0][2].getValue() == value){
			buttons[0][0].setWinningIcon(); buttons[0][1].setWinningIcon(); buttons[0][2].setWinningIcon();
			return true;
		}else if(buttons[1][0].getValue() == value && buttons[1][1].getValue() == value && buttons[1][2].getValue() == value){
			buttons[1][0].setWinningIcon(); buttons[1][1].setWinningIcon(); buttons[1][2].setWinningIcon();
			return true;
		}else if(buttons[2][0].getValue() == value && buttons[2][1].getValue() == value && buttons[2][2].getValue() == value){
			buttons[2][0].setWinningIcon(); buttons[2][1].setWinningIcon(); buttons[2][2].setWinningIcon();
			return true;
		}else if(buttons[0][0].getValue() == value && buttons[1][0].getValue() == value && buttons[2][0].getValue() == value){
			buttons[0][0].setWinningIcon(); buttons[1][0].setWinningIcon(); buttons[2][0].setWinningIcon();
			return true;
		}else if(buttons[0][1].getValue() == value && buttons[1][1].getValue() == value && buttons[2][1].getValue() == value){
			buttons[0][1].setWinningIcon(); buttons[1][1].setWinningIcon(); buttons[2][1].setWinningIcon();
			return true;
		}else if(buttons[0][2].getValue() == value && buttons[1][2].getValue() == value && buttons[2][2].getValue() == value){
			buttons[0][2].setWinningIcon(); buttons[1][2].setWinningIcon(); buttons[2][2].setWinningIcon();
			return true;
		}else if(buttons[0][0].getValue() == value && buttons[1][1].getValue() == value && buttons[2][2].getValue() == value){
			buttons[0][0].setWinningIcon(); buttons[1][1].setWinningIcon(); buttons[2][2].setWinningIcon();
			return true;
		}else if(buttons[0][2].getValue() == value && buttons[1][1].getValue() == value && buttons[2][0].getValue() == value){
			buttons[0][2].setWinningIcon(); buttons[1][1].setWinningIcon(); buttons[2][0].setWinningIcon();
			return true;
		}
		return false;
	}
	
	public static void resetXOButtons(){
		for (int i = 0; i < 9; i++) {
			buttons[i/3][i%3].setValue(0);
			buttons[i/3][i%3].resetImage();
		}
	}
	
	public static boolean isGridFull(){
		for (int i = 0; i < 9; i++) {
			if(buttons[i/3][i%3].getValue() == 0){
				return false;
			}
		}
		return true;
	}
	
	public static void shiftIcons(){
		for (int i = 0; i < 9; i++) {
			buttons[i/3][i%3].switchIcons();;
		}
	}
}