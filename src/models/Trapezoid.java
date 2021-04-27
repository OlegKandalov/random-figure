package models;

import enums.Color;
import interfaces.TrapezoidInterface;

public class Trapezoid extends Figure implements TrapezoidInterface {
    private double a;
    private double b;
    private double c;
    private double d;

    private double middleLine;
    private double height;
    private double area;
    private double perimeter;

    public Trapezoid(Color color, boolean isDrawn, double height, double a, double b, double c, double d) {
        super(color, isDrawn);
        this.height = height;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.middleLine = getMiddleLine();
        this.area = getArea();
        this.perimeter = getPerimeter();
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public void setMiddleLine(double middleLine) {
        this.middleLine = middleLine;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getMiddleLine() {
        return (a + b) / 2;
    }

    @Override
    public double getArea() {
        double middleLine = getMiddleLine();
        double height = getHeight();
        return middleLine * height;
    }

    @Override
    public double getPerimeter() {
        return a + b + c + d;
    }

    @Override
    public String toString() {
        return "Figure: Trapezoid{" +
                "color=" + getColor() +
                ", middleLine=" + middleLine +
                ", height=" + height +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
