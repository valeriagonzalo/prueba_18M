package es.uah.matcomp.mp.e1.ejerciciosclases.d.AbstractShape;

public class Square extends Rectangle{

    //Constructores:
    public Square() {
    }

    public Square(double s) {
        super.setLength(s);
        super.setWidth(s);
    }

    public Square(double s, String c, boolean f) {
        super.setLength(s);
        super.setWidth(s);
        super.setColor(c);
        super.setFilled(f);
    }

    //Getters:
    public double getSide() {
        return super.getWidth();
    }

    //Setters:
    public void setSide(double newSide) {
        super.setWidth(newSide);
    }

    @Override // De la clase Rectangle
    public void setWidth(double newSide) {
        super.setWidth(newSide);
    }

    @Override // De la clase Rectangle
    public void setLength(double newSide) {
        super.setLength(newSide);
    }

    @Override //Para asegurarnos que coincida con el de la superclase.
    public String toString() {
        return "Square: [" + super.toString() + "]";
    }
}
