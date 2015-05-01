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

public class PlayerPanel extends JPanel {
	
	public Player player;
	public Timer timer;
	public final JLabel score;
	
	public PlayerPanel(final Player player) {
		super();
		Font font = new Font("Verdana", Font.BOLD, 40);
		this.player = player;
        this.setBackground(Color.RED);
        this.setLayout(new GridLayout(3, 1));
		JTextField name = new JTextField("Vul naam in");
		name.setBorder(BorderFactory.createLineBorder(new Color(0x808080), 2));
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setEditable(true);
        name.setForeground(Color.WHITE);
        name.setBackground(Color.RED);
        name.setFont(font);
		add(name);
		score = new JLabel("" + player.score, SwingConstants.CENTER);
		score.setBorder(BorderFactory.createLineBorder(new Color(0x808080), 2));
        score.setForeground(Color.WHITE);
        score.setBackground(Color.RED);
        score.setFont(font);
		add(score);
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(1, 2));
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player.score--;
                score.setText(""+player.score);
            }
        });
		JButton startButton = new JButton("START");
		ActionListener startListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				timer.start();
			}
		};
		startButton.addActionListener(startListener);
		JButton stopButton = new JButton("STOP");
		ActionListener stopListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				timer.stop();
			}
		};
		stopButton.addActionListener(stopListener);
		buttonPanel.add(startButton);
		buttonPanel.add(stopButton);
		add(buttonPanel);
	}

	 void setScore() {
		 score.setText(""+player.score);	
	}

}
