package shapes;

import polygons.polygon.IPolygon;

import java.awt.*;

public class ShapeAdapter implements IPolygon {
    private Shape shape;

    public ShapeAdapter(Shape shape) {
        this.shape = shape;
    }

    @Override
    public Point getCenterPoint() {
        return shape.getCenterPoint();
    }

    @Override
    public void updateCenter(int x, int y) {
        Point centerPoint = getCenterPoint();
        shape.translate(
                (int) (x - centerPoint.getX()),
                (int) (y - centerPoint.getY())
        );
    }

    @Override
    public void paint(Graphics g) {
        shape.paint(g);
    }
}
