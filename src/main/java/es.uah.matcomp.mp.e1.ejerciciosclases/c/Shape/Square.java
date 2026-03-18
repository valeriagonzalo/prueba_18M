package es.uah.matcomp.mp.e1.ejerciciosclases.c.Shape;

public class Square extends Rectangle{

    //Constructores:
    public Square(){
    }

    public Square(double s) {
        super.setLenght(s);
        super.setWidth(s);
    }

    public Square(double s, String c, boolean f){
        super.setLenght(s);
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

    @Override //Se usa también en Rectangle.
    public void setWidth(double newSide) {
        super.setWidth(newSide);
    }

    @Override //Se usa también en Rectangle.
    public void setLenght(double newSide) {
        super.setLenght(newSide);
    }

    //ToString:
    @Override //Para asegurarnos que coincida con el de la superclase
    public String toString() {
        return "Square: [" + super.toString() + "]";
    }
}
