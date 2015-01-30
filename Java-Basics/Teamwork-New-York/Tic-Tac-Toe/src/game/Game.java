package game;
import panels.*;

import javax.swing.JFrame;


public class Game extends JFrame{
	private static final long serialVersionUID = 1L;
	public static int gamesCounter;
	public static MainPanel mainPanel;
	public static Player playerOne;
	public static Player playerTwo;
	public static String playerOneName;
	public static String playerTwoName;
	
	public static void main(String[] args) {
		new LoadingScreen();

	}
	
	public Game(){
		super("TicTacToe");
		playerOne = new Player(playerOneName, true);
		playerTwo = new Player(playerTwoName, false);
		mainPanel = new MainPanel(playerOne, playerTwo);
		
		add(mainPanel);
		setSize(700, 360);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void restartGame(){
		GridPanel.resetXOButtons();
		++gamesCounter;
		if(gamesCounter%2 == 1){
			if(playerOne.isTurn()){
				switchTurns();
				
			}
		}else{
			if(playerTwo.isTurn()){
				switchTurns();
			}
		}
		GridPanel.shiftIcons();
		MainPanel.getStatsPanel().refresh(Game.playerOne, Game.playerTwo);
	}
	
	public static void switchTurns(){
		playerOne.setTurn(!playerOne.isTurn());
		playerTwo.setTurn(!playerTwo.isTurn());
	}
	
	public static void getPlayerNames(String playerOneName, String platerTwoName){
		Game.playerOneName = playerOneName;
		Game.playerTwoName = platerTwoName;
	}
}