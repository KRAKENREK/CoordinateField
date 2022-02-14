package krakenrek.render;

import java.awt.*;
import java.util.Map;

public abstract class AbstractRenderAble implements IRenderAble{

    private Map<String, Color> colorMap = new ChainMap<String, Color>().putC("simple", Color.BLACK).putC("unique", Color.RED);
    private Map<String, Stroke> strokeMap = new ChainMap<String, Stroke>().putC("simple", new BasicStroke(1));

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
    public abstract void render(Graphix graphix);
}
