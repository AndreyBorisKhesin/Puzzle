import java.awt.*;
import java.util.Set;

public class Piece {
	public final Color color;

	public final Set<Point> points;

	public Piece(Color color, Set<Point> points) {
		if (!points.contains(new Point()) || !Point.flat(points)) {
			throw new IllegalArgumentException();
		}
		this.color = color;
		this.points = points;
	}

	public String name() {
		return color.toString();
	}
}
