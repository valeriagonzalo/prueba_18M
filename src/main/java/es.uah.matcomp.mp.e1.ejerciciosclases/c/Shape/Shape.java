package es.uah.matcomp.mp.e1.ejerciciosclases.c.Shape;

public class Shape{

    //Variables:
    private String color = "red";
    private boolean filled = true;

    //Constructores:
    public Shape(){
    }

    public Shape(String c, boolean f) {
        this.color = c;
        this.filled = f;
    }

    //Getters:
    public String getColor() {
        return color;
    }

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
    } //True = lleno / False = no lleno.

    //ToString:
    public String toString() {
        return " Shape: [color = " + color + ", filled = " + filled + "]";
    }
}
