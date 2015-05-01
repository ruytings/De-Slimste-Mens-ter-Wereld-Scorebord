package application;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class AllPlayersPanel extends JPanel {
	
	public Game game;
	
	public AllPlayersPanel(Game game) {
		super();
		this.game = game;
		this.setLayout(new GridLayout(1, 3));
		PlayerPanel p1 = new PlayerPanel(game.player1);
		PlayerPanel p2 = new PlayerPanel(game.player2);
		PlayerPanel p3 = new PlayerPanel(game.player3);
		this.add(p1);
		game.p1 = p1;
		this.add(p2);
		game.p2 = p2;
		this.add(p3);
		game.p3 = p3;
		
	}

	
}
