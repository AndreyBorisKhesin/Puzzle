import java.awt.*;
import java.util.Set;

public class Piece {
	public final Color c;

	public final Set<Point> s;

	public Piece(Color c, Set<Point> s) {
		this.c = c;
		this.s = s;
	}
}
