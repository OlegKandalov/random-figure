import models.Figure;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figure> setWithFigure = GenerateFigure.getRandomSet();
        System.out.println(setWithFigure);
    }
}

