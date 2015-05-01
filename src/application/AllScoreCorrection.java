package application;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class AllScoreCorrection extends JPanel {

	public Game game;
	
	public AllScoreCorrection(Game game) {
		super();
		this.game = game;
		this.setLayout(new GridLayout(1, 3));
		this.add(new ScoreCorrection(game.player1));
		this.add(new ScoreCorrection(game.player2));
		this.add(new ScoreCorrection(game.player3));
	}
}
