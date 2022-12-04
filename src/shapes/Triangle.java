package shapes;

import java.awt.*;
import java.util.List;
import java.util.*;

/**
 * Created by Niklas on 2016-02-14.
 */
public class Triangle extends Shape {
    public Triangle(int x, int y, int sizeX, int sizeY, double rotation){
        super(x,y);
        this.scale(sizeX,sizeY);
        this.rotate(rotation);
    }
    public Triangle(int x, int y, int sizeX, int sizeY){
        super(x,y);
        this.scale(sizeX,sizeY);
    }
    public Triangle(int x, int y, double rotation){
        super(x,y);
        this.rotate(rotation);
    }
    public Triangle(int x, int y){
        super(x,y);
    }
    public int[][] getOffsets(){
        int[][] offsets = {{ 0,             -getScaleY()*58/100},
                {-getScaleX()/2,  getScaleY()*29/100},
                { getScaleX()/2,  getScaleY()*29/100}
        };
        return offsets;
    }
}