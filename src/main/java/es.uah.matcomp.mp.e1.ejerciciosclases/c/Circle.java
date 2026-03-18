package es.uah.matcomp.mp.e1.ejerciciosclases.c;

public class Circle {

    //Variables:
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    //Constructores:
    public Circle(double r) {
        this.radius = r;
        this.color = "red";
    }

    public Circle(double r, String c) {
        this.radius = r;
        this.color = c;
    }

    //Getters:
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    //Setters:
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    //ToString:
    public String toString() {
        return "Circle[radius = " + radius + ", color = " + color + "]";
    }

}
