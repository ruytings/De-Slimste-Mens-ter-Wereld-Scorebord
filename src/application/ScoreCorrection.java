package application;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class ScoreCorrection extends JPanel {

	public Player player;
	
	public ScoreCorrection(final Player player) {
		super();
		Font font = new Font("Verdana", Font.BOLD, 20);
		this.player = player;
        this.setBackground(Color.RED);
        this.setLayout(new GridLayout(4, 2));
		JButton button10 = new JButton("+ 10");
		button10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				player.score += 10;
				player.game.p1.setScore();
				player.game.p2.setScore();
				player.game.p3.setScore();
			}});
		add(button10);
		JButton button15 = new JButton("+ 15");
		button15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				player.score += 15;
				player.game.p1.setScore();
				player.game.p2.setScore();
				player.game.p3.setScore();
			}});
		add(button15);
		JButton button20 = new JButton("+ 20");
		button20.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				player.score += 20;
				player.game.p1.setScore();
				player.game.p2.setScore();
				player.game.p3.setScore();
			}});
		add(button20);
		JButton button30 = new JButton("+ 30");
		button30.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				player.score += 30;
				player.game.p1.setScore();
				player.game.p2.setScore();
				player.game.p3.setScore();
			}});
		add(button30);
		JButton button40 = new JButton("+ 40");
		button40.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				player.score += 40;
				player.game.p1.setScore();
				player.game.p2.setScore();
				player.game.p3.setScore();
			}});
		add(button40);
		JButton button50 = new JButton("+ 50");
		button50.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				player.score += 50;
				player.game.p1.setScore();
				player.game.p2.setScore();
				player.game.p3.setScore();
			}});
		add(button50);
		JButton buttonMin = new JButton("- 20");
		buttonMin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				player.score -= 20;
				player.game.p1.setScore();
				player.game.p2.setScore();
				player.game.p3.setScore();
			}});
		add(buttonMin);
	}

	
	
}
