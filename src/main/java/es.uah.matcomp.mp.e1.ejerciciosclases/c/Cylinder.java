package es.uah.matcomp.mp.e1.ejerciciosclases.c;

public class Cylinder extends  Circle {

    //Variables de la subclase:
    private double height;

    //Constructores:
    public Cylinder() {
        super(); // "super" abarca radius y color, de la superclase Circle.
        this.height = 1.0;
    }

    public Cylinder(double h) {
        super();
        this.height = h;
    }

    public Cylinder(double r, double h) {
        super(r);
        this.height = h;
    }

    public Cylinder(double r, double h, String c) {
        super(r, c);
        this.height = h;
    }

    //Getters:
    public double getHeight() {
        return height;
    }

    public double getArea() {
        return 2 * height * Math.PI + 2 * super.getArea();
    }

    public double getVolume() {
        return height * super.getArea();
    }

    //ToString:
    @Override //Nos ayuda a asegurarnos de que hemos escrito bien toString:
    public String toString() {
        return "Cylinder: subclass of "+ super.toString() + "height = " + height; //super.toString() = Circle.
    }

}
