package es.uah.matcomp.mp.e1.ejerciciosclases.d.GeometricObject_Resizable;

public class SecondCircle implements GeometricObject { //implements nos sirve para hacer uso de la interfaz.

    //Variables:
    protected double radius;

    //Constructores:
    public SecondCircle(double r) {
        this.radius = r;
    }

    //Getters:
    @Override
    public double getArea(){
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
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
