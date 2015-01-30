package game;
public class Player {
	private String name;
	private int score;
	private boolean turn;
	
	public Player(String name, boolean turn){
		this.setName(name);
		this.setScore(0);
		this.setTurn(turn);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	public boolean isTurn() {
		return turn;
	}
	public void setTurn(boolean turn) {
		this.turn = turn;
	}
	
}
