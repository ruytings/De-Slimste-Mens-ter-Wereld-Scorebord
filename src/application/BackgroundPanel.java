package application;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class BackgroundPanel extends JPanel {
	
	public BufferedImage image;

	public BackgroundPanel(Game game) {
		super();
		if(game.round == 0) {
			try {
		           image = ImageIO.read(getClass().getResource("start.jpg"));
		            
		        } catch (IOException ex) {
		            System.out.println("start.jpg not found.");
		        }
		        revalidate();
		        repaint();
		} else {
			setBackground(Color.YELLOW);
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	}
}
