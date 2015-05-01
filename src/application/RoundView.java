package application;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class RoundView extends JFrame {
	
	public Game game;
	
	public RoundView(final Game game) {
		super("De slimste mens ter wereld");
		this.game = game;
		this.setLayout(new GridLayout(2, 1));
		this.add(new AllPlayersPanel(game));
		this.add(new AllScoreCorrection(game));
		this.setFocusable(true);
		this.setBackground(Color.RED);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	    this.setSize(screenSize);
	    this.setVisible(true);    
	    this.setResizable(false); 
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
