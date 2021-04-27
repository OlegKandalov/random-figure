package models;

import enums.Color;
import interfaces.CircleInterface;

public class Circle extends Figure implements CircleInterface {
    final double Pi = 3.1415926536;
    private double diameter;
    private double perimeter;
    private double radius;
    private double area;

    public Circle(Color color, boolean isDrawn, double diameter) {
        super(color, isDrawn);
        this.diameter = diameter;
        this.perimeter = getPerimeter();
        this.radius = getRadius();
        this.area = getArea();
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getDiameter() {
        return diameter;
    }

    @Override
    public double getPerimeter() {
        final double radius = getRadius();
        return 2 * Pi * radius;
    }

    @Override
    public double getRadius() {
        return diameter / 2;
    }

    @Override
    public double getArea() {
        final double radius = getRadius();
        return Pi * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Figure: Circle{" +
                "color=" + getColor() +
                ", perimeter=" + perimeter +
                ", radius=" + radius +
                ", area=" + area +
                '}';
    }
}
