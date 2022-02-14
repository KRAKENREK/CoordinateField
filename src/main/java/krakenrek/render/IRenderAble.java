package krakenrek.render;

import java.awt.*;
import java.util.Map;

public interface IRenderAble {
    Map<String, Color> getColors();
    Color getColor(String key);
    void setColor(String key, Color value);
    Map<String, Stroke> getStrokes();
    Stroke getStroke(String key);
    void setStroke(String key, Stroke value);

    void render(Graphix graphix);
}
