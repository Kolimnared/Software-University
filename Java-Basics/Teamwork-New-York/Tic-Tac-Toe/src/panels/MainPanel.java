package panels;
import java.awt.Color;
import java.awt.GridLayout;

import game.*;

import javax.swing.JPanel;

public class MainPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public static GridPanel gridPanel;
	private static StatsPanel statsPanel;
	
	public MainPanel(Player one, Player two){
		gridPanel = new GridPanel();
		setStatsPanel(new StatsPanel(one, two));
		setLayout(new GridLayout(1, 2, 3, 3));
		add(gridPanel);
		add(getStatsPanel());
		setBackground(Color.black);
	}

	public static StatsPanel getStatsPanel() {
		return statsPanel;
	}

	public static void setStatsPanel(StatsPanel statsPanel) {
		MainPanel.statsPanel = statsPanel;
	}
}
