import models.Figure;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Figure[] setWithFigure = GenerateFigure.getRandomSet();
        System.out.println(Arrays.toString(setWithFigure));
    }
}

