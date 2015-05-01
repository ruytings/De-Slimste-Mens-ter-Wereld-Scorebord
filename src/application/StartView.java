package application;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartView extends JFrame {
	
	public Game game;
	
	public StartView() {
		super("De slimste mens ter wereld");
		game = new Game();
		this.setFocusable(true);
		this.addKeyListener(new KeyListener(){
			@Override
			public void keyPressed(KeyEvent e) {
				 if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				      dispose();
				      RoundView r1 = new RoundView(game);
				 }
			}
			@Override
			public void keyReleased(KeyEvent e) {
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}});
		this.getContentPane().add(new BackgroundPanel(game));
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	    this.setSize(screenSize);
	    this.setVisible(true);    
	    this.setResizable(false); 
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
