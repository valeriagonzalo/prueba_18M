package es.uah.matcomp.mp.e1.ejerciciosclases.c.Shape;

public class Rectangle extends Shape{

    //Variables:
    private double width = 1.0;
    private double lenght = 1.0;

    //Constructores:
    public Rectangle(){
    }

    public Rectangle(double w, double h, String c, boolean f) {
        super(c,f);
        this.width = w;
        this.lenght = h;
    }

    //Getters:
    public double getWidth() {
        return width;
    }

    public double getLenght() {
        return lenght;
    }

    public double getArea(){
        double area = lenght * width;
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2 * lenght + 2 * width;
        return perimeter;
    }

    //Setters:
    public void setWidth(double newWidth) {
        this.width = newWidth;
    }

    public void setLenght(double newHeight) {
        this.lenght = newHeight;
    }

    @Override //Para asegurarnos que coincida con el de la superclase
    public String toString() {
        return "Rectangle[" + super.toString() + ", width = " + width + ", height = " + lenght + "]";
    }
}
