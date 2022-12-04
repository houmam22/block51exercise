package polygons.polygon;

import java.awt.*;

/**
 * Created by Niklas on 2016-01-19.
 */
class Square extends Polygon {
    public Square(int x, int y) {
        super(x,y);
    }

   @Override
    public void paint(Graphics g){
        g.drawRect(getCenterPoint().x - 10, getCenterPoint().y - 10, 20, 20);
    }
}
