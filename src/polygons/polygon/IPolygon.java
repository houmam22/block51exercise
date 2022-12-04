package polygons.polygon;

import java.awt.*;

public interface IPolygon {
    Point getCenterPoint();
    void updateCenter(int i, int i1);
    void paint(Graphics g);
}
