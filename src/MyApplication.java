import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Point> points = new ArrayList<>();

        try {
            File file = new File("points.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextDouble()) {
                double x = scanner.nextDouble();
                double y = scanner.nextDouble();
                points.add(new Point(x, y));
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: file not found");
            return;
        }

        Shape shape = new Shape(points);

        System.out.println("List of points:");
        for (Point p : points) {
            System.out.println(p);
        }

        System.out.println("Perimeter of the figure: " + shape.calculatePerimeter());
        System.out.println("The longest side: " + shape.longestSide());
        System.out.println("Average side length: " + shape.averageSide());
    }
}
