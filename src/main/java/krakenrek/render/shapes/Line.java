package krakenrek.render.shapes;

import krakenrek.render.ChainMap;
import krakenrek.render.Graphix;
import krakenrek.render.IRenderAble;
import krakenrek.render.Point;


import java.awt.*;
import java.util.Map;

public class Line implements IRenderAble {

    private Map<String, Color> colorMap = new ChainMap<String, Color>().putC("simple", Color.BLACK).putC("unique", Color.RED);
    private Map<String, Stroke> strokeMap = new ChainMap<String, Stroke>().putC("simple", new BasicStroke(2));

    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Map<String, Color> getColors() {
        return colorMap;
    }

    @Override
    public Color getColor(String key) {
        return colorMap.get(key);
    }

    @Override
    public void setColor(String key, Color value) {
        colorMap.put(key, value);
    }

    @Override
    public Map<String, Stroke> getStrokes() {
        return strokeMap;
    }

    @Override
    public Stroke getStroke(String key) {
        return strokeMap.get(key);
    }

    @Override
    public void setStroke(String key, Stroke value) {
        strokeMap.put(key, value);
    }

    @Override
    public void render(Graphix graphix) {
        graphix.update(this, "simple", "simple");
        graphix.drawLine(start, end);
    }
}
