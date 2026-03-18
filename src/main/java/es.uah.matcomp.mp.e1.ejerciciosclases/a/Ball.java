package es.uah.matcomp.mp.e1.ejerciciosclases.a;

public class Ball {

    //Variables:
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    //Construcores:
    public Ball(float x, float y, int r, float xd, float yd){
        this.x = x;
        this.y = y;
        radius = r;
        xDelta = xd;
        yDelta = yd;
    }

    //Getters:
    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

    public int getRadius(){
        return radius;
    }

    public float getXDelta(){
        return xDelta;
    }

    public float getYDelta(){
        return yDelta;
    }

    //Setters:
    public void setX(float newX){
        x = newX;
    }

    public void setY(float newY){
        y = newY;
    }

    public void setRadius(int newRadius){
        radius = newRadius;
    }

    public void setXDelta(float newXDelta){
        xDelta = newXDelta;
    }

    public void setYDelta(float newYDelta){
        yDelta = newYDelta;
    }

    //toString:
    public String toString(){
        return "Ball[(" + x + "," + y + "), speed = (" + xDelta + "," + yDelta + ")]";
    }

    //Otros métodos:
    public void move(){
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal(){
        xDelta = -xDelta;
    }

    public void reflectVertical(){
        yDelta = -yDelta;
    }
}
