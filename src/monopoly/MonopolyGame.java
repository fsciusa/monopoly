package monopoly;

import java.util.ArrayList;
import java.util.List;

public class MonopolyGame {

	private static final int ROUNDS_TOTAL = 20;
	private static final int PLAYERS_TOTAL = 2;
    private List<Player> players;
    private Board board;
	private Die[] dice = { new Die(), new Die() };

	public MonopolyGame() {
        board = new Board();
        players = new ArrayList<>(PLAYERS_TOTAL);
        players.add(new Player("Horse", dice, board));
        players.add(new Player("Car", dice, board));
	}

	public void addPlayer(Player player) {
	    players.add(player);
    }

	public void playGame() {
		for (int i = 0; i < ROUNDS_TOTAL; i++) {
			playRound();
		}
	}
	
	private void playRound() {
		for (Player player : players) {
		    player.takeTurn();
        }
	}

}
