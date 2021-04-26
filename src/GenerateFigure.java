import enums.Color;
import models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateFigure {
    final static Random random = new Random();

    public static List<Figure> getRandomSet() {
        List<Figure> fullSet = new ArrayList<>();
        fullSet.add(getRandomCircle());
        fullSet.add(getRandomSquare());
        fullSet.add(getRandomTriangle());
        fullSet.add(getRandomTrapezoid());

        List<Figure> figures = new ArrayList<>();
        int lengthOfArray = new Random().nextInt(10) + 1;
        for (int i = 0; i < lengthOfArray; i++) {
            figures.add(fullSet.get(random.nextInt(3)));
        }
        return figures;
    }

    public static Circle getRandomCircle() {
        Circle circle = new Circle();
        circle.setDiameter(random.nextDouble() + 1);
        return new Circle(getRandomColor(), circle.getPerimeter(), circle.getRadius(), circle.getArea());
    }

    public static Square getRandomSquare() {
        Square square = new Square();
        square.setA(random.nextDouble() + 1);
        return new Square(getRandomColor(), square.getDiagonal(), square.getPerimeter(), square.getArea());
    }

    public static Trapezoid getRandomTrapezoid() {
        Trapezoid trapezoid = new Trapezoid();
        trapezoid.setA(random.nextDouble() + 1);
        trapezoid.setB(random.nextDouble() + 1);
        trapezoid.setHeight(random.nextDouble() + 1);
        return new Trapezoid(getRandomColor(), trapezoid.getMiddleLine(),
                trapezoid.getHeight(), trapezoid.getMiddleLine(), trapezoid.getPerimeter());
    }

    public static Triangle getRandomTriangle() {
        Triangle triangle = new Triangle();
        triangle.setA(random.nextDouble() + 1);
        triangle.setB(random.nextDouble() + 1);
        return new Triangle(getRandomColor(), triangle.getArea(),
                triangle.getHypotenuse(), triangle.getPerimeter());
    }

    public static Color getRandomColor() {
        int pick = random.nextInt(Color.values().length);
        return Color.values()[pick];
    }
}
