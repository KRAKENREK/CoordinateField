package krakenrek.render;

import krakenrek.render.converter.IConverter;
import krakenrek.render.converter.SimpleConverter;
import krakenrek.render.net.INet;
import krakenrek.render.net.SimpleNet;
import krakenrek.render.shapes.Line;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Field extends JComponent {



    private List<IRenderAble> renderAbles = new ArrayList<>();

    private INet net;

    private IConverter converter;

    public Field(INet net, IConverter converter) {
        this.net = net;
        this.converter = converter;
    }

    public void add(IRenderAble drawable) {
        renderAbles.add(drawable);
    }

    @Override
    public void paint(Graphics g) {
        converter.updateGraphicalData(new GraphicalData(getWidth(), getHeight()));
        Graphix graphix = new Graphix((Graphics2D) g,converter);
        net.render(graphix);
        renderAbles.forEach(e -> e.render(graphix));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Field field = new Field(new SimpleNet(), new SimpleConverter());
        field.add(new Line(Point.of(0, 0), Point.of(100, 200)));
        frame.add(field);
        frame.setSize(720, 480);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

