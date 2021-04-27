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
        double randomValue = random.nextDouble() + 1;
        return new Circle(getRandomColor(), true, randomValue);
    }

    public static Square getRandomSquare() {
        double randomValue = random.nextDouble() + 1;
        return new Square(getRandomColor(), true, randomValue);
    }

    public static Trapezoid getRandomTrapezoid() {
        double randomA = random.nextDouble() + 1;
        double randomB = random.nextDouble() + 1;
        double randomC = random.nextDouble() + 1;
        double randomD = random.nextDouble() + 1;
        double randomHeight = random.nextDouble() + 1;
        return new Trapezoid(getRandomColor(), true, randomHeight, randomA, randomB, randomC, randomD);
    }

    public static Triangle getRandomTriangle() {
        double randomA = random.nextDouble() + 1;
        double randomB = random.nextDouble() + 1;
        return new Triangle(getRandomColor(), true, randomA, randomB);
    }

    public static Color getRandomColor() {
        int pick = random.nextInt(Color.values().length);
        return Color.values()[pick];
    }
}
