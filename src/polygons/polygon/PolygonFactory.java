package polygons.polygon;
import shapes.*;
import shapes.Triangle;

public class PolygonFactory {
    public static IPolygon makeSquare(int x, int y){
        return new Square(x, y);
    }
    public static IPolygon makeTriangle(int x, int y){
        return new ShapeAdapter(new Triangle(x, y));
    }
    public static IPolygon makeRectangle(int x, int y){
        return new ShapeAdapter(new shapes.Rectangle(x, y));
    }
}
