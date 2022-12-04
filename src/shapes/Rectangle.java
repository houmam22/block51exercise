package shapes;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Niklas on 2016-02-14.
 */
public class Rectangle extends Shape {

    public Rectangle(int x, int y, int sizeX, int sizeY, double rotation){
        super(x,y);
        this.scale(sizeX,sizeY);
        this.rotate(rotation);
    }

    public Rectangle(int x, int y, int sizeX, int sizeY){
        super(x,y);
        this.scale(sizeX,sizeY);
    }

    public Rectangle(int x, int y, double rotation){
        this(x,y,1,1,rotation);
    }

    public Rectangle(int x, int y){
        this(x,y,1,1);
    }

    public int[][] getOffsets(){
        return new int[][] {
                {-getScaleX()/2, -getScaleY()/2},
                { getScaleX()/2, -getScaleY()/2},
                { getScaleX()/2,  getScaleY()/2},
                {-getScaleX()/2,  getScaleY()/2}
        };
    }


}
