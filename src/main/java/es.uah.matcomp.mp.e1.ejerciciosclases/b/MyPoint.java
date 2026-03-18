package es.uah.matcomp.mp.e1.ejerciciosclases.b;

public class MyPoint {
    //Variables:
    private int x = 0;
    private int y = 0;

    //Constructores
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Getters:
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[] getXY() {
        return new int[]{x,y};
    }

    //Setters:
    public void setX(int newX){
        this.x = newX;
    }

    public void setY(int newY){
        this.y = newY;
    }

    public void setXY(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    //Otros métodos:
    public double distance(int x_2, int y_2) {
        return  Math.sqrt(Math.pow(x_2-x,2)+Math.pow(y_2-y,2));
    }

    public double distance(MyPoint puntoDado) {
        return Math.sqrt(Math.pow(puntoDado.x-x,2)+Math.pow(puntoDado.y-y,2));
    }

    public double distance() {
        return  Math.sqrt(Math.pow(0-x,2)+Math.pow(0-y,2));
    }

    //ToString:
    public String toString() {
        return "( " + x + "," + y + ")";
    }

}
