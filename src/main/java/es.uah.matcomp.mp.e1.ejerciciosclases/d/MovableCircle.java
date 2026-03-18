package es.uah.matcomp.mp.e1.ejerciciosclases.d;

public class MovableCircle implements Movable{ //implements nos sirve para hacer uso de la interfaz.

    //Variables:
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xs, int ys, int r) {
        this.radius = r;
        center = new MovablePoint(x,y,xs,ys);
    }

    //Otros métodos:
    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }

    //ToString:
    @Override
    public String toString() {
        return center.toString() + ", radius = " + radius;
    }
}