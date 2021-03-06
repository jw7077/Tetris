package mvc.model;

import java.awt.*;

public abstract class AShape implements IShape {
    protected ShapeType type;
    protected Color color;
    protected int[] center;
    protected int rotate;
    int[] pos;

    // pos[0] = changes in x, pos[1] are changes in y
    public AShape(ShapeType type, Color color) {
        if (type == null || color == null ) {
            throw new IllegalStateException("Invalid shape parameter");
        } else if (rotate < 0 ) {
            throw new IllegalStateException("parameter can't be negative");
        }
        this.type = type;
        this.color = color;
        this.center = pos;
        rotate = 0;
    } //********************for tesing***********

    public AShape(ShapeType type) {
        this.type = type;
        this.color = Color.black;
        this.rotate = 0;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

//    @Override
//    public void setCenter(int[] pos) {
//        this.center = pos;
//    }

    @Override
    public void setX(int x) {
        this.center[0] = x;
    }

    @Override
    public void setY(int y) {
        this.center[1] = y;
    }

    @Override
    public void setRotate() {
    	// need to set to 0 after 3
        this.rotate += 1;
        if(rotate ==4) {
        	rotate = 0;
        }
    }
    public void reRotate() {
    	// need to set to 0 after 3
        this.rotate -= 1;
        if(rotate == -1) {
        	rotate = 3;
        }
    }

    @Override
    public Color getColor() {
//        deep copy
        return new Color(this.color.getRGB());
    }

    @Override
    public int[] getCenter() {
        int[] temp = new int[2];
        temp[0] = this.center[0];
        temp[1] = this.center[1];
        return temp;
    }
  

    @Override
    public int getRotation() {
        return this.rotate;
    }

    @Override
    public void moveLeft() {
        this.center[0]-=1;
//        It should be done in controller
//        if (this.center[0]<0) this.center[0]=0;
    }

    @Override
    public void moveRight(){
        this.center[0]+=1;
    }
// To Do
    @Override
    public void goDown(){
//        speed up timer;

    }
    
    
    
    public int[] getPos() {
    	return pos;
    }
    public void setPos(int[] pos) {
    	this.pos = pos;
    }
}