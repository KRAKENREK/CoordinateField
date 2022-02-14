package krakenrek.render.converter;

import krakenrek.render.GraphicalData;
import krakenrek.render.Pixel;
import krakenrek.render.Point;

public interface IConverter {
    void updateGraphicalData(GraphicalData data);

    int convertX(double x);
    int convertY(double y);

    double unConvertX(int x);
    double unConvertY(int y);

    Pixel convert(Point p);
    Point unConvert(Pixel p);

    Point getCenterPoint();
    void setCenterPoint(Point center);
    Pixel getCenterPixel();
    void setCenterPixel(Pixel center);

    GraphicalData getGraphicalData();

}
