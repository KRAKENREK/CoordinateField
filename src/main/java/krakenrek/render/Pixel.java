package krakenrek.render;

import krakenrek.render.converter.IConverter;

public class Pixel implements Cloneable {
    private int x;
    private int y;

    public Pixel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Pixel of(int x, int y) {
        return new Pixel(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Pixel withX(int x) {
        return new Pixel(x, y);
    }

    public Pixel withY(int y) {
        return new Pixel(x, y);
    }

    public Point toPoint(IConverter converter) {
        return converter.unConvert(this);
    }

    @Override
    public Object clone() {
        return new Pixel(x, y);
    }

    @Override
    public String toString() {
        return "Pixel{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}


