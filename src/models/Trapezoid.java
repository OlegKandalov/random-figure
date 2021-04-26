package models;

import enums.Color;
import interfaces.TrapezoidInterface;

public class Trapezoid extends Figure implements TrapezoidInterface {
    private Color color;
    private boolean isDrawn;
    private double a;
    private double b;
    private double c;
    private double d;

    private double middleLine;
    private double height;
    private double area;
    private double perimeter;

    public Trapezoid(Color color, double middleLine, double height, double area, double perimeter) {
        this.color = color;
        this.middleLine = middleLine;
        this.height = height;
        this.area = area;
        this.perimeter = perimeter;
    }

    public Trapezoid() {
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
    public boolean isDrawn() {
        return false;
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
                "color=" + color +
                ", middleLine=" + middleLine +
                ", height=" + height +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
