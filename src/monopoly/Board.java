package monopoly;

import java.util.ArrayList;
import java.util.List;

public class Board {
	private static final int SIZE = 40;
	private List<Square> squares = new ArrayList<>(SIZE);

	public Board() {
		buildSquares();
		linkSquares();
	}

	public Square getSqure(Square start, int distance) {
		int endIndex = (start.getIndex() + distance) % SIZE;
		return squares.get(endIndex);
	}
	public Square getStartSquare() {
		return squares.get(0);
	}

	private void buildSquares() {
		for (int i = 0; i < SIZE; i++) {
			Square s = new Square("Square " + i, i);
			squares.add(s);
		}
	}

	private void linkSquares() {
		for (int i = 0; i < SIZE - 1; i++) {
			Square current = squares.get(i);
			Square next = squares.get(i + 1);
			current.setNextSquare(next);
		}
		Square first = squares.get(0);
		Square last = squares.get(SIZE - 1);
		last.setNextSquare(first);
	}


}
