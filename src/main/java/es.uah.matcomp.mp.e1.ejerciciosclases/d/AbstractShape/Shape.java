package es.uah.matcomp.mp.e1.ejerciciosclases.d.AbstractShape;

public abstract class Shape{

    //Variables:
    protected String color = "red"; //protected para que las demas clases del paquete puedan usarla
    protected boolean filled = true; //protected para que las demas clases del paquete puedan usarla

    //Constructores:
    public Shape() {
    }

    public Shape(String c, boolean f) {
        this.color = c;
        this.filled = f;
    }

    //Getters:
    public String getColor() {
        return color;
    }

    abstract double getArea(); //Como es abstracta todas las clases que hereden deberan de usar este método.

    abstract double getPerimeter(); //Como es abstracta todas las clases que hereden deberan de usar este método.

    //Setters:
    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setFilled(boolean newFilled) {
        this.filled = newFilled;
    }

    //Otros métodos:
    public boolean isFilled() {
        return filled;
    } // True = lleno / False = no lleno.

    //ToString:
    public String toString() {
        return "Shape: [color = " + color + ", filled = " + filled + "]";
    }
}
