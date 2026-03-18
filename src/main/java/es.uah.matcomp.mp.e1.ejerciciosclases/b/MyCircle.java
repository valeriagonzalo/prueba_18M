package es.uah.matcomp.mp.e1.ejerciciosclases.b;

public class MyCircle {

    //Variables:
    private int radius = 1;
    private MyPoint center = new MyPoint(0, 0);

    //Constructores
    public MyCircle() {
        this.radius = 1;
        this.center = new MyPoint(0, 0);
    }

    public MyCircle(int x, int y, int r) {
        this.radius = r;
        center = new MyPoint(x, y);
    }

    public MyCircle(MyPoint c, int r) {
        this.radius = r;
        this.center = c;
    }

    //Getters:
    public int getRadius() {
        return radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public int getCenterX() {
        return center.getX();
    }

    public int getCenterY() {
        return center.getY();
    }

    public int[] getCenterXY() {
        return center.getXY();
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return Math.PI * 2 * radius;
    }

    public void setRadius(int newRadius) {
        this.radius = newRadius;
    }

    public void setCenter(MyPoint newCenter) {
        this.center = newCenter;
    }

    public void setCenterX(int newX) {
        this.center.setX(newX);
    }

    public void setCenterY(int newY) {
        this.center.setY(newY);
    }

    public void setCenterXY(int x, int y) {
        this.center.setXY(x, y);
    }

    //Otros métodos:
    public double distance(MyCircle distancia) {
        return center.distance(distancia.center);
    }

    //ToString:
    public String toString() {
        return "MyCircle[radius=" + radius + ", center=" + center + "]";
    }
}