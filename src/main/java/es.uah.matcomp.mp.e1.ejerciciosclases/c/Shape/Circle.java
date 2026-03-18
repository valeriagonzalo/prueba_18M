package es.uah.matcomp.mp.e1.ejerciciosclases.c.Shape;

public class Circle extends Shape{

    //Variables:
    private double radius = 1.0;

    //Constructores:
    public Circle(){
        super();
    }

    public Circle(double r) {
        super();
        this.radius = r;
    }

    public Circle(double r, String c, boolean f) {
        super(c,f);
        this.radius = r;
    }

    //Getters:
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * radius * Math.PI;
        return perimeter;
    }

    //Setters:
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    //ToString:
    @Override //Para asegurarnos que coincida con el de la superclase
    public String toString() {
        return "Circle: [" + super.toString() + ", radius = " + radius + "]";
    }
}
