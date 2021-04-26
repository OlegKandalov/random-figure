package models;

import enums.Color;
import interfaces.SquareInterface;

public class Square extends Figure implements SquareInterface {
    private Color color;
    private double a;
    private double diagonal;
    private double perimeter;
    private double area;
    private boolean isDrawn;

    public Square(Color color, double diagonal, double perimeter, double area) {
        this.color = color;
        this.diagonal = diagonal;
        this.perimeter = perimeter;
        this.area = area;
    }

    public Square() {
    }

    public void setDrawn(boolean drawn) {
        isDrawn = drawn;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double getDiagonal() {
        final double area = getArea();
        return Math.sqrt(2 * area);
    }

    @Override
    public boolean isDrawn() {
        return false;
    }

    @Override
    public double getArea() {
        return Math.pow(a, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }

    @Override
    public String toString() {
        return "Figure: Square{" +
                "color=" + color +
                ", diagonal=" + diagonal +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
