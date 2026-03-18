package es.uah.matcomp.mp.e1.ejerciciosclases.c;

public class Point2D {

    //Variables:
    private float x = 0.0f; //Escribimos la f al lado del número para que sea un float, sino sería double.
    private float y = 0.0f; //Escribimos la f al lado del número para que sea un float, sino sería double.

    //Constructores:
    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    //Getters:
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float[] getXY() {
        return new float[]{x, y}; //Si no creamos un nuevo array cada vez que llamemos a la función, da error.
    }

    //Setters:
    public void setX(float newX) {
        this.x = newX;
    }

    public void setY(float newY) {
        this.y = newY;
    }

    public void setXY(float newX, float newY) {
        this.x = newX;
        this.y = newY;
    }

    //ToString.
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
