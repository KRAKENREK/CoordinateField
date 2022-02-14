package krakenrek.render;

import krakenrek.render.converter.IConverter;

import java.awt.*;

public class Graphix {
    private Graphics2D wrapped;
    private IConverter converter;

    public Graphix(Graphics2D wrapped, IConverter converter) {
        this.wrapped = wrapped;
        this.converter = converter;
    }

    public PolygonX createPolygon() {
        return new PolygonX();
    }

    public void setColor(Color color) {
        wrapped.setColor(color);
    }

    public void setStroke(Stroke stroke) {
        wrapped.setStroke(stroke);
    }

    public int convertX(double x) {
        return converter.convertX(x);
    }

    public int convertY(double y) {
        return converter.convertY(y);
    }

    public Graphics2D getWrapped() {
        return wrapped;
    }

    public IConverter getConverter() {return converter;}

    public void drawLine(double x1, double y1, double x2, double y2) {
        wrapped.drawLine(convertX(x1), convertY(y1), convertX(x2), convertY(y2));
    }

    public void drawLine(Point start, Point end) {
        wrapped.drawLine(convertX(start.getX()), convertY(start.getY()), convertX(end.getX()), convertY(end.getY()));
    }

    public void drawPolygon(PolygonX p) {
        wrapped.drawPolygon(p.toAwt(converter));
    }

    public void fillPolygon(PolygonX p) {
        wrapped.fillPolygon(p.toAwt(converter));
    }

    public void updateColor(IRenderAble drawable, String context) {
        setColor(drawable.getColor(context));
    }

    public void updateStroke(IRenderAble drawable, String context) {
        setStroke(drawable.getStroke(context));
    }

    public void update(IRenderAble drawable, String colorContext, String strokeContext) {
        updateColor(drawable, colorContext);
        updateStroke(drawable, strokeContext);
    }


}
