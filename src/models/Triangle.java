package models;

import enums.Color;
import interfaces.TriangleInterface;

public class Triangle extends Figure implements TriangleInterface {
    private double a;
    private double b;
    private double area;
    private double hypotenuse;
    private double perimeter;

    public Triangle(Color color, boolean isDraw, double a, double b) {
        super(color, isDraw);
        this.a = a;
        this.b = b;
        this.area = getArea();
        this.hypotenuse = getHypotenuse();
        this.perimeter = getPerimeter();
    }

    public Triangle() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public boolean isDrawn() {
        return false;
    }

    @Override
    public double getArea() {
        double semiP = getPerimeter() / 2;
        double c = getHypotenuse();
        return Math.sqrt(semiP * (semiP - a) * (semiP - b) * (semiP - c));
    }

    @Override
    public double getHypotenuse() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    @Override
    public double getPerimeter() {
        double c = getHypotenuse();
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Figure: Triangle{" +
                "color=" + getColor() +
                ", area=" + area +
                ", hypotenuse=" + hypotenuse +
                ", perimeter=" + perimeter +
                '}';
    }
}
