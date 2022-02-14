package krakenrek.render.net;

import krakenrek.render.AbstractRenderAble;
import krakenrek.render.GraphicalData;
import krakenrek.render.Graphix;
import krakenrek.render.Point;
import krakenrek.render.converter.IConverter;
import krakenrek.render.shapes.Line;

import java.awt.*;

public class SimpleNet extends AbstractRenderAble implements INet{

    @Override
    public void render(Graphix graphix) {

        Graphics2D rawGraphics = graphix.getWrapped();
        IConverter converter = graphix.getConverter();
        GraphicalData graphicalData = graphix.getConverter().getGraphicalData();

        for (int a = graphicalData.getW()/2; a <= graphicalData.getW(); a+=converter.convertX(stepCell())) {

        }

    }

    @Override
    public double stepCell() {
        return 4d;
    }

}
