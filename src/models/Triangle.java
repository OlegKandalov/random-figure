package models;

import enums.Color;
import interfaces.TriangleInterface;

public class Triangle extends Figure implements TriangleInterface {
    private Color color;
    private boolean isDrawing;
    private double a;
    private double b;
    private double area;
    private double hypotenuse;
    private double perimeter;

    public Color getColor() {
        return color;
    }

    public Triangle(Color color, double area, double hypotenuse, double perimeter) {
        this.color = color;
        this.area = area;
        this.hypotenuse = hypotenuse;
        this.perimeter = perimeter;
    }

    public Triangle() {
    }

    public void setDrawing(boolean drawing) {
        isDrawing = drawing;
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
                "color=" + color +
                ", area=" + area +
                ", hypotenuse=" + hypotenuse +
                ", perimeter=" + perimeter +
                '}';
    }
}
