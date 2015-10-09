import java.util.Set;

public class Point {
	public final int x;

	public final int y;

	public final int z;

	public Point() {
		this(0, 0, 0);
	}

	public Point(int x, int y, int z) {
		if (x < 0 || y < 0 || z < 0) {
			throw new IllegalArgumentException();
		}
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Point add(Point point) {
		return new Point(x + point.x, y + point.y, z + point.z);
	}

	public boolean equals(Point point) {
		return x == point.x && y == point.y && z == point.z;
	}

	public static boolean flat(Set<Point> points) {
		Point sum = new Point();
		for (Point point : points) {
			sum = sum.add(point);
		}
		return sum.x == 0 || sum.y == 0 || sum.z == 0;
	}
}
