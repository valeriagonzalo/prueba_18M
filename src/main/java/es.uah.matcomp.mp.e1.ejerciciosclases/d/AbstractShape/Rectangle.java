package es.uah.matcomp.mp.e1.ejerciciosclases.d.AbstractShape;

public class Rectangle extends Shape{

    //Variables:
    protected double width = 1.0; //protected para que las demas clases del paquete puedan usarla
    protected double length = 1.0; //protected para que las demas clases del paquete puedan usarla

    //Constructores:
    public Rectangle() {
    }

    public Rectangle(double w, double l, String c, boolean f) {
        super(c,f);
        this.width = w;
        this.length = l;
    }

    //Getters:
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override // De la clase Shape
    public double getArea() {
        double area = length * width;
        return area;
    }

    @Override // De la clase Shape
    public double getPerimeter() {
        double perimeter = 2 * length + 2 * width;
        return perimeter;
    }

    //Setters:
    public void setWidth(double newWidth) {
        this.width = newWidth;
    }

    public void setLength(double newLength) {
        this.length = newLength;
    }

    //ToString:
    @Override //Para asegurarnos que coincida con el de la superclase.
    public String toString() {
        return "Rectangle: [" + super.toString() + ", width = " + width + ", length = " + length + "]";
    }
}

