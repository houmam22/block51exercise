package shapes;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
// import java.util.*;
// import java.util.List; //This is to avoid ambiguity for List

/**
 * Created by Niklas on 2016-02-14.
 */
public abstract class Shape extends JComponent {
    private Point centerPoint;
    private int scaleX = 10;
    private int scaleY = 10;
    private double rotation = 0; // Degrees clockwise

    public Point getCenterPoint() {
        return centerPoint;
    }

    public int getScaleX() {
        return scaleX;
    }

    public int getScaleY() {
        return scaleY;
    }

    public double getRotation() {
        return rotation;
    }
    private List<Point> getCorners(){
        // DIT952.polygons.Triangle has three corners
        java.util.List<Point> corners = new ArrayList<>(3);

        Point center = getCenterPoint();
        int[][] offsets = getOffsets();

        for (int i = 0; i < offsets.length; i++){
            // start from center, find corner
            Point newCorner = new Point(center.x+offsets[i][0], center.y+offsets[i][1]);


            // rotate by 'getRotation' degrees
            double alpha = Math.toRadians(getRotation());
            double newX = center.x + (newCorner.x - center.x) * Math.cos(alpha) - (newCorner.y - center.y) * Math.sin(alpha);
            double newY = center.y + (newCorner.x - center.x) * Math.sin(alpha) + (newCorner.y - center.y) * Math.cos(alpha);
            newCorner.move((int) newX, (int) newY);

            corners.add(newCorner);
        }
        return corners;
    }

    private Shape(Point center){
        this.centerPoint = center;
   }
    public Shape(int x, int y){
        this(new Point(x,y));
    }


    public void translate(int x, int y){
        centerPoint.move(centerPoint.x + x,centerPoint.y + y);
    }

    public void scale(int x, int y){
        this.scaleX = scaleX * x;
        this.scaleY = scaleY * y;
    }

    public void rotate(double angle){
        this.rotation = rotation + angle;
    }


    public void paint(Graphics g){
        List<Point> corners = getCorners();
        // first and last point should be the same
        corners.add(corners.get(0));
        Point from = null;
        for (Point to : corners){
            if (from != null){
                g.drawLine(from.x, from.y, to.x, to.y);
            }
            from = to;
        }
    }
    public abstract int[][] getOffsets();

}