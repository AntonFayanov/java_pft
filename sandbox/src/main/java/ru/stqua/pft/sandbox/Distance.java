package ru.stqua.pft.sandbox;

public class Distance {

    private double a, b;

    public Distance(double a, double b) {
        this.a = a;
        this.b = b;
    }


    public double distance(Point p) {
        return Math.sqrt(Math.pow(p.a - a, 2) + Math.pow(p.b - b, 2));

    }
}

