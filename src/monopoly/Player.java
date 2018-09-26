package monopoly;

public class Player {
	
	private String name;
	private Piece piece;
    private Board board;
	private Die[] dice;

	public Player(String name, Die[] dice, Board board) {
        this.name = name;
		this.dice = dice;
		this.board = board;
		piece = new Piece(board.getStartSquare());
	}

	public void takeTurn() {
		int rollTotal = 0;

		for (Die die : dice) {
		    die.roll();
		    rollTotal += die.getFaceValue();
		}
		
		Square oldLoc = piece.getLocation();
		Square newLoc = board.getSqure(oldLoc, rollTotal);
		piece.setLocation(newLoc);
    }

	public Square getLocation() {
	    return piece.getLocation();
    }

    public String getName() {
        return name;
    }
}
