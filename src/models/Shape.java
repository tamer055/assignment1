import java.util.List;

public class Shape {
    private List<Point> points;

    public Shape(List<Point> points) {
        this.points = points;
    }

    public double calculatePerimeter() {
        double perimeter = 0;

        for (int i = 0; i < points.size(); i++) {
            Point current = points.get(i);
            Point next = points.get((i + 1) % points.size());
            perimeter += current.distanceTo(next);
        }

        return perimeter;
    }

    public double longestSide() {
        double max = 0;

        for (int i = 0; i < points.size(); i++) {
            Point current = points.get(i);
            Point next = points.get((i + 1) % points.size());
            double distance = current.distanceTo(next);

            if (distance > max) {
                max = distance;
            }
        }

        return max;
    }

    public double averageSide() {
        return calculatePerimeter() / points.size();
    }
}
