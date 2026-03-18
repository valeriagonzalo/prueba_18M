package es.uah.matcomp.mp.e1.ejerciciosclases.d;

public class MovablePoint implements Movable{ //implements nos sirve para hacer uso de la interfaz.

    //Variables:
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    //Constructores:
    public MovablePoint(int x, int y, int xs, int ys) {
        this.x = x;
        this.y = y;
        this.xSpeed = xs;
        this.ySpeed = ys;
    }

    //Otros métodos:
    public void moveUp() {
        y = y + ySpeed;
    }

    public void moveDown() {
        y = y - ySpeed;
    }

    public void moveLeft() {
        x = x - xSpeed;
    }

    public void moveRight() {
        x = x + xSpeed;
    }

    //ToString:
    @Override
    public String toString() {
        return "(" + x + ", " + y + ") speed = ("+ xSpeed + ", " + ySpeed + ")";
    }
}
