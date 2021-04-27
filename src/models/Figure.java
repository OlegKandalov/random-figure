package models;

import enums.Color;

public abstract class Figure {
    private Color color;
    private boolean isDrawn;

    public Figure(Color color, boolean isDrawn) {
        this.color = color;
        this.isDrawn = isDrawn;
    }

    public Figure() {
    }

    abstract double getArea();

    abstract double getPerimeter();

    boolean isDrawn() {
        return isDrawn;
    }

    Color getColor() {
        return color;
    }
}
