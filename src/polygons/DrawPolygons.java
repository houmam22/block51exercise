package polygons;

import polygons.polygon.IPolygon;
import polygons.polygon.PolygonFactory;

import javax.swing.*;
import java.awt.Graphics;
import java.util.*;

public class DrawPolygons extends JComponent{
    private List<IPolygon> polygons;
    private boolean direction = true;
    private int ticker = 0;

    public DrawPolygons(){
        polygons = new ArrayList<>(10);

        polygons.add(PolygonFactory.makeSquare(50, 50));
        polygons.add(PolygonFactory.makeTriangle(100, 100));
        polygons.add(PolygonFactory.makeRectangle(50,150));

    }//constructor

    private void update(){
        ticker++;
        int value = direction ? 10 : -10;
        for (IPolygon p: polygons){
            p.updateCenter(p.getCenterPoint().x+value, p.getCenterPoint().y+value);
        }
        if (ticker > 10) {
            direction = !direction;
            ticker = 0;
        }
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        for (IPolygon currentPolygon : polygons) {
            currentPolygon.paint(g);
        }
    }//paint

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawPolygons polygons = new DrawPolygons();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(30,30,300,300);
        frame.getContentPane().add(polygons);
        frame.setVisible(true);


        try {
            while (true) {
                Thread.sleep(500);
                polygons.update();
            }
        } catch (InterruptedException e) {}

    }//main

}//DIT953.polygons.DrawPolygons