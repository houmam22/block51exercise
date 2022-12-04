package polygons.polygon;

import java.awt.*;

/**
 * Created by Niklas on 2016-01-19.
 */
class Triangle extends Polygon {
    public Triangle(int x, int y) {
        super(x,y);
    }

    @Override
    public void paint(Graphics g){
        g.drawLine(getCenterPoint().x, getCenterPoint().y-10, getCenterPoint().x-10, getCenterPoint().y+10);
        g.drawLine(getCenterPoint().x-10, getCenterPoint().y+10,
                getCenterPoint().x+10, getCenterPoint().y+10);
        g.drawLine(getCenterPoint().x+10, getCenterPoint().y+10, getCenterPoint().x, getCenterPoint().y-10);
    }
}
