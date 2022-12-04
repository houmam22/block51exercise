package polygons.polygon;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Niklas on 2016-01-19.
 */
public abstract class Polygon extends JComponent implements IPolygon{
    private Point centerPoint;

    private Polygon(Point center){
        this.centerPoint = center;
    }
    public Polygon(int x, int y){
        this(new Point(x,y));
    }

    public void updateCenter(int x, int y){
        this.centerPoint = new Point(x,y);
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    @Override
    public abstract void paint(Graphics g)//paint
    ;
}
