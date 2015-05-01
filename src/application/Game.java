package application;



public class Game {

	public Player player1, player2, player3;
	public int round;
	public PlayerPanel p1 ,p2, p3;
	
	public Game() {
		player1 = new Player(this);
		player2 = new Player(this);
		player3 = new Player(this);
	}

}
