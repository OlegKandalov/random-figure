package models;

import enums.Color;
import interfaces.SquareInterface;

public class Square extends Figure implements SquareInterface {
    private double a;
    private double diagonal;
    private double perimeter;
    private double area;

    public Square(Color color, boolean isDrawn, double a) {
        super(color, isDrawn);
        this.a = a;
        this.diagonal = getDiagonal();
        this.perimeter = getPerimeter();
        this.area = getArea();
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
                "color=" + getColor() +
                ", diagonal=" + diagonal +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
