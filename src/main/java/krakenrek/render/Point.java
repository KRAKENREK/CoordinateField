package krakenrek.render;

import krakenrek.render.converter.IConverter;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Point of(double x, double y) {
        return new Point(x, y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point withX(double x) {
        return new Point(x, y);
    }

    public Point withY(double y) {
        return new Point(x, y);
    }

    public Pixel toPixel(IConverter converter) {
        return converter.convert(this);
    }

    @Override
    public Object clone() {
        return new Point(x, y);
    }

    @Override
    public String toString() {
        return "Pixel{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
