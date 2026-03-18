package es.uah.matcomp.mp.e1.ejerciciosclases.d.GeometricObject_Resizable;

public class Rectangle  implements GeometricObject { //implements nos sirve para hacer uso de la interfaz.

    //Variables:
    private double width;
    private double length;

    //Constructores:
    public Rectangle(double w, double l) {
        this.width = w;
        this.length = l;
    }

    //Getters:
    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public String toString() {
        return "Rectangle[width = " + width + ", lenght = " +length + "]";
    }
}