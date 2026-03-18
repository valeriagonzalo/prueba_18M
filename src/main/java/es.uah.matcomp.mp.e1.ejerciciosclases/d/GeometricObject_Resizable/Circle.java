package es.uah.matcomp.mp.e1.ejerciciosclases.d.GeometricObject_Resizable;

public class Circle implements GeometricObject { //implements nos sirve para hacer uso de la interfaz.

    //Variables:
    private double radius;

    //Constructores:
    public Circle(double r) {
        this.radius = r;
    }

    //Getters:
    public double getArea(){
        double area = Math.PI * radius * radius;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * radius * Math.PI;
        return perimeter;
    }

    //ToString:
    @Override
    public String toString() {
        return "Circle: [radius = " + radius + "]";
    }
}
