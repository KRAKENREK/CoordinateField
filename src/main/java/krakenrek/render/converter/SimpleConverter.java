package krakenrek.render.converter;

import krakenrek.render.GraphicalData;
import krakenrek.render.Pixel;
import krakenrek.render.Point;

public class SimpleConverter implements IConverter{

    private GraphicalData g;

    @Override
    public void updateGraphicalData(GraphicalData data) {
        g = data;
    }

    @Override
    public int convertX(double x) {
        return (int) x+g.getW()/2;
    }

    @Override
    public int convertY(double y) {
        return (int) -y + g.getH()/2;
    }

    @Override
    public double unConvertX(int x) {
        return x;
    }

    @Override
    public double unConvertY(int y) {
        return y;
    }

    @Override
    public Pixel convert(Point p) {
        return new Pixel(convertX(p.getX()), convertX(p.getY()));
    }

    @Override
    public Point unConvert(Pixel p) {
        return new Point(unConvertX(p.getX()), unConvertX(p.getY()));
    }

    @Override
    public Point getCenterPoint() {
        return Point.of(0, 0);
    }

    @Override
    public void setCenterPoint(Point center) {

    }

    @Override
    public Pixel getCenterPixel() {
        return Pixel.of(g.getW()/2, g.getH()/2);
    }

    @Override
    public void setCenterPixel(Pixel center) {

    }

    @Override
    public GraphicalData getGraphicalData() {
        return g;
    }
}
