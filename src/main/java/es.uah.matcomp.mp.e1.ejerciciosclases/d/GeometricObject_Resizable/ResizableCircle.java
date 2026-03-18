package es.uah.matcomp.mp.e1.ejerciciosclases.d.GeometricObject_Resizable;

public class ResizableCircle extends SecondCircle implements Resizable{

    //Constructores:
    public ResizableCircle(double r) {
        super(r);
    }

    //Otros métodos:
    @Override
    public void resize(int percent) {
        radius = radius * percent/100.0;
    }

    //ToString:
    @Override
    public String toString() {
        return "ResizableCircle: [" + super.toString() + "]";
    }
}