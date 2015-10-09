import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Board {
	private Map<Piece, Point> pieces;

	private int size;

	public Board() {
		this(new HashMap<>());
	}

	public Board(Map<Piece, Point> pieces) {
		this.pieces = pieces;
		size = (4 * (pieces.size() / 3) - 1) * (pieces.size() / 3) + 2;
	}

	public boolean add() {

	}

	public boolean clear() {
		int total = 0;
		for (Piece piece : pieces.keySet()) {

		}
	}

	public Color[][][] grid() {
		Color[][][] grid = new Color[size][size][size];

	}

	public Map<Piece, Point> getPieces() {
		return pieces;
	}
}
