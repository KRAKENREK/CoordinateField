package krakenrek.render;

import krakenrek.render.converter.IConverter;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PolygonX {
    private List<Point> points = new ArrayList<>();

    public void addPoint(Point p) {
        points.add(p);
    }

    public void addPoint(double x, double y) {
        points.add(Point.of(x, y));
    }

    public Polygon toAwt(IConverter converter) {
        Polygon polygon = new Polygon();
        points.forEach(e -> polygon.addPoint(converter.convertX(e.getX()), converter.convertY(e.getY())));
        return polygon;
    }
}
